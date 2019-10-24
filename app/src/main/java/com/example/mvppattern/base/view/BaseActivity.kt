package com.example.mvppattern.base.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvppattern.base.IBaseViewMain
import com.example.mvppattern.exceptions.NetworkException

abstract class BaseActivity: AppCompatActivity(),IBaseViewMain{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentViewId())
        initializeData(savedInstanceState)
        initializeComponents()
        registerListeners()
    }

    override fun onDestroy() {
        unRegisterListeners()
        super.onDestroy()
    }

    fun handleBusinessException(throwable: Throwable){
        if (throwable is NetworkException){

        }
    }

    open fun unRegisterListeners() {

    }

    open fun registerListeners() {

    }
}