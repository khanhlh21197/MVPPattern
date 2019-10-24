package com.example.mvppattern.base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvppattern.base.IBaseViewMain
import com.example.mvppattern.extensions.inflate

abstract class BaseFragment : Fragment(), IBaseViewMain {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(getContentViewId())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeData(savedInstanceState)
        initializeComponents()
        registerListeners()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        unRegisterListeners()
    }

    open fun unRegisterListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    open fun registerListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}