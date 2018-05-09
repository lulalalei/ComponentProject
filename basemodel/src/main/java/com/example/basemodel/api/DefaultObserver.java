package com.example.basemodel.api;

import android.text.TextUtils;

import com.example.basemodel.R;
import com.example.basemodel.bases.BaseView;
import com.example.basemodel.cans.Constants;
import com.example.basemodel.utils.LogUtil;
import com.example.basemodel.utils.ToastUitl;
import com.google.gson.JsonParseException;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.HttpException;

import static com.example.basemodel.api.DefaultObserver.ExceptionReason.CONNECT_ERROR;
import static com.example.basemodel.api.DefaultObserver.ExceptionReason.CONNECT_TIMEOUT;
import static com.example.basemodel.api.DefaultObserver.ExceptionReason.PARSE_ERROR;
import static com.example.basemodel.api.DefaultObserver.ExceptionReason.UNKNOWN_ERROR;

/**
 * Created by Administrator on 2018/5/8.
 */

public abstract class DefaultObserver<T extends ResultApi> extends ResourceSubscriber<T>{

    private BaseView mView;

    public DefaultObserver(BaseView view) {
        this.mView=view;
    }

    @Override
    public void onNext(T response) {
        mView.dissmissLoading();
        if (Constants.SUCCESS==response.getCode()) {
            onSuccess(response);
        } else if (Constants.SESSIONID_OUT_OF_TIME==response.getCode()){
            //session过期，需要重新登录
            mView.haveLoginInOtherDevices();
            mView.showMsg(response.getMsg());
        }else {
            onFail(response);
        }
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        mView.dissmissLoading();
        LogUtil.e("Retrofit", e.getMessage());
        if (e instanceof HttpException) {     //   HTTP错误
            onException(ExceptionReason.BAD_NETWORK);
        } else if (e instanceof ConnectException
                || e instanceof UnknownHostException) {   //   连接错误
            onException(CONNECT_ERROR);
        } else if (e instanceof InterruptedIOException) {   //  连接超时
            onException(CONNECT_TIMEOUT);
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {   //  解析错误
            onException(PARSE_ERROR);
        } else {
            onException(UNKNOWN_ERROR);
        }
    }

    /**
     * 请求成功
     *
     * @param response 服务器返回的数据
     */
    abstract public void onSuccess(T response);

    /**
     * 服务器返回数据，但响应码不为200
     *
     * @param response 服务器返回的数据
     */
    public void onFail(T response) {
        String message = response.getMsg();
        if (TextUtils.isEmpty(message)) {
            ToastUitl.showShort(R.string.response_return_error);
        } else {
            ToastUitl.showShort(message);
        }
    }

    /**
     * 请求异常
     *
     * @param reason
     */
    public void onException(ExceptionReason reason) {
        switch (reason) {
            case CONNECT_ERROR:
                ToastUitl.showShort(R.string.connect_error);
                break;

            case CONNECT_TIMEOUT:
                ToastUitl.showShort(R.string.connect_timeout);
                break;

            case BAD_NETWORK:
                ToastUitl.showShort(R.string.bad_network);
                break;

            case PARSE_ERROR:
                ToastUitl.showShort(R.string.parse_error);
                break;

            case UNKNOWN_ERROR:
            default:
                ToastUitl.showShort(R.string.unknown_error);
                break;
        }
    }

    /**
     * 请求网络失败原因
     */
    public enum ExceptionReason {
        /**
         * 解析数据失败
         */
        PARSE_ERROR,
        /**
         * 网络问题
         */
        BAD_NETWORK,
        /**
         * 连接错误
         */
        CONNECT_ERROR,
        /**
         * 连接超时
         */
        CONNECT_TIMEOUT,
        /**
         * 未知错误
         */
        UNKNOWN_ERROR,
    }

}
