package com.example.administrator.componentdemo.p;

import com.example.administrator.componentdemo.v.MainActivityContract;
import com.example.basemodel.api.DefaultObserver;
import com.example.basemodel.api.ResultApi;
import com.example.basemodel.bases.RxBus;
import com.example.basemodel.bases.RxPresenter;
import com.example.basemodel.bases.RxSchedulers;
import com.example.basemodel.cans.Constants;
import com.example.basemodel.eventbean.TestEvent;

import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * Created by Administrator on 2018/5/8.
 */

public class MainActivityPresenter extends MainActivityContract.Presenter{

    private String currentType = Constants.SEND_MESSAGE_TEST;

    @Override
    public void onAttached() {
        super.onAttached();
        registEvent();
    }

    //接收RxBus发送的数据
    private void registEvent() {
        addSubscribe(RxBus.getDefault().toFlowable(TestEvent.class)
                    .compose(RxSchedulers.<TestEvent>io_main())
                    .filter(new Predicate<TestEvent>() {
                        @Override
                        public boolean test(TestEvent testEvent) throws Exception {
                            return testEvent.getType().equals(currentType);
                        }
                    })
                    .map(new Function<TestEvent, ResultApi>() {
                        @Override
                        public ResultApi apply(TestEvent testEvent) throws Exception {
                            return new ResultApi(Constants.SUCCESS,testEvent.getQuery());
                            //return testEvent.getQuery();
                        }
                    })
                    .subscribeWith(new DefaultObserver<ResultApi>(mView){

                        @Override
                        public void onSuccess(ResultApi response) {
                            mView.responseMsg(response.getMsg());
                        }
                    })
        );
    }
}
