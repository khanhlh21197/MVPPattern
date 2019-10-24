package com.example.mvppattern.view.fragment

import com.example.mvppattern.data.local.User

interface SignupContract{
    interface View{
        fun onSignupSuccess()

        fun onSignupFail()
    }

    interface Preseneter{
        fun handleSignup(user: User)
    }
}