package com.example.mvppattern.view.fragment

interface LoginContract {
    interface View{
        fun loginSuccess()

        fun loginFail(message: String)
    }
    interface Presenter{
        fun handleLogin(username: String, password: String)
    }
}