package com.example.basemodel.bases;

/**
 * Created by Administrator on 2018/5/7.
 */

public abstract class BasePresenter<M,V> {

    public M mModel;

    public V mView;

    public void setVM(V v,M m){
        this.mView=v;
        this.mModel=m;
        this.onAttached();
    }

    public abstract void onAttached();

    public void onDetached(){

    }

}
