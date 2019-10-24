package com.example.mvppattern.view.fragment

import com.example.mvppattern.base.view.BasePresenter
import com.example.mvppattern.data.local.User

class SignupPresenter : SignupContract.Preseneter, BasePresenter<SignupContract.View>() {
    override fun handleSignup(user: User) {

    }
}