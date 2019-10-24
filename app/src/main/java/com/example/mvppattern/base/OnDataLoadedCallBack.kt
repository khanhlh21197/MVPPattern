package com.example.mvppattern.base

interface OnDataLoadedCallBack<T>{
    fun onSuccess(data: T)

    fun onFailure(throwable: Throwable)
}