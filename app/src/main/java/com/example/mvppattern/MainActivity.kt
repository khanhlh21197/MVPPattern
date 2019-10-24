package com.example.mvppattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mvppattern.R
import com.example.mvppattern.base.view.BaseActivity
import com.example.mvppattern.view.fragment.LoginFragment
import com.example.mvppattern.view.fragment.SignupFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getContentViewId(): Int = R.layout.activity_main

    override fun initializeData(savedInstanceState: Bundle?) {}

    override fun initializeComponents() {}

    override fun registerListeners() {
        tvLogin.setOnClickListener { showFragment(LoginFragment.newInstance()) }
        tvSignUp.setOnClickListener { showFragment(SignupFragment.newInstance()) }
    }

    override fun unRegisterListeners() {
        super.unRegisterListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        unRegisterListeners()
    }

    fun showFragment(fragment: Fragment){
        val fragmentTransaction =supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.rootLayout, fragment)
        fragmentTransaction.commit()
    }
}
