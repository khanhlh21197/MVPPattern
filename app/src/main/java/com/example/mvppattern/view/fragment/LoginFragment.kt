package com.example.mvppattern.view.fragment

import android.os.Bundle
import com.example.mvppattern.R
import com.example.mvppattern.base.view.BaseFragment

class LoginFragment : BaseFragment(){

    override fun getContentViewId(): Int = R.layout.fragment_login

    override fun initializeData(savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initializeComponents() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object{
        @JvmStatic
        fun newInstance(): LoginFragment = LoginFragment()
    }

}