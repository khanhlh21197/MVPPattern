package com.example.mvppattern.base

import android.os.Bundle

interface IBaseViewMain {
    fun getContentViewId(): Int

    fun initializeData(savedInstanceState : Bundle?)

    fun initializeComponents()
}