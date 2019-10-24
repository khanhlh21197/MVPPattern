package com.example.mvppattern.view.fragment

import com.example.mvppattern.base.view.BasePresenter

class LoginPresenter : LoginContract.Presenter, BasePresenter<LoginContract.View>(){

    override fun handleLogin(username: String, password: String) {

    }
}