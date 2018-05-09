package com.example.basemodel.bases;

import java.util.HashMap;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.PublishProcessor;

/**
 * Created by Administrator on 2018/5/7.
 */

public class RxBus {

    private HashMap<String, CompositeDisposable> mSubscriptionMap;

    private final FlowableProcessor<Object> bus;

    //PublishSubject 只会把在订阅发生时间点之后来自原始Flowable的数据发射给观察者
    public RxBus() {
        bus= PublishProcessor.create().toSerialized();
    }

    public static RxBus getDefault(){
        return RxBusHolder.sInstance;
    }

    private static class RxBusHolder{
        private static final RxBus sInstance=new RxBus();
    }

    //提供了一个新的事件
    public void post(Object o){
        bus.onNext(o);
    }

    //根据传递的eventType类型返回特定类型(eventType)的 被观察者
    public <T> Flowable<T> toFlowable(Class<T> eventType){
        return bus.ofType(eventType);
    }

    //封装默认订阅
    public <T> Disposable toDefaultFlowable(Class<T> eventType, Consumer<T> act){
        return bus.ofType(eventType).compose(RxSchedulers.<T>io_main()).subscribe(act);
    }

    /*
    * 是否已有观察者订阅
    * */
    public boolean hasObservers(){
        return bus.hasSubscribers();
    }

    /*public void addSubscription(Object o,Disposable disposable){
        if (mSubscriptionMap==null){
            mSubscriptionMap=new HashMap<>();
        }
        String key=o.getClass().getName();
        if (mSubscriptionMap.get(key)!=null){
            mSubscriptionMap.get(key).add(disposable);
        }else {
            //一次性容器,可以持有多个并提供添加和移除
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            compositeDisposable.add(disposable);
            mSubscriptionMap.put(key,compositeDisposable);
        }
    }

    *//*
    * 取消订阅
    * *//*
    public void unSubscribe(Object o){
        if (mSubscriptionMap==null){
            return;
        }
        String key = o.getClass().getName();
        if (!mSubscriptionMap.containsKey(key)){
            return;
        }
        if (mSubscriptionMap.get(key)!=null){
            mSubscriptionMap.get(key).dispose();
        }
        mSubscriptionMap.remove(key);
    }*/
}
