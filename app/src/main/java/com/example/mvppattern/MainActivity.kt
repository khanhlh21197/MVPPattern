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
        tvLogin.setOnClickListener { supportFragmentManager.addFragment(R.layout.fragment_login,
            LoginFragment.newInstance(), "Login") }
        tvSignUp.setOnClickListener { supportFragmentManager.addFragment(R.layout.fragment_signup,
            SignupFragment.newInstance(), "Sign Up") }
    }

    override fun unRegisterListeners() {
        super.unRegisterListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        unRegisterListeners()
    }

    fun FragmentManager.addFragment(containerViewId: Int, fragment: Fragment,
                                    tag: String,
                                    slideIn: Int = R.anim.slide_left,
                                    slideOut: Int = R.anim.slide_right){
        this.beginTransaction()
            .setCustomAnimations(slideIn, slideOut)
            .add(containerViewId, fragment, tag)
            .addToBackStack(null)
            .commit()
    }
}
