package com.example.basemodel.bases;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Administrator on 2018/5/7.
 */

public class RxPresenter<M,V> extends BasePresenter<M,V>{

    private CompositeDisposable mCompositeDisposable;

    public void unSubscribe(){
        if (mCompositeDisposable!=null){
            mCompositeDisposable.clear();
        }
    }

    public void addSubscribe(Disposable disposable){
        if (mCompositeDisposable==null){
            mCompositeDisposable=new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public <U> void addRxBusSubscribe(Class<U> eventType, Consumer<U> action){
        if (mCompositeDisposable==null){
            mCompositeDisposable=new CompositeDisposable();
        }
        mCompositeDisposable.add(RxBus.getDefault().toDefaultFlowable(eventType, action));
    }

    @Override
    public void onAttached() {

    }

    @Override
    public void onDetached() {
        super.onDetached();
        unSubscribe();
    }
}
