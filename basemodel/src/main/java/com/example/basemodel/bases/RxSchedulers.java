package com.example.basemodel.bases;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * RxJava线程调度
 * Created by Administrator on 2018/5/7.
 */

public class RxSchedulers {

    public static <T> FlowableTransformer<T, T> io_main() {
        return new FlowableTransformer<T, T>() {
            @Override
            public Flowable<T> apply(Flowable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
