package com.example.mvppattern.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layoutResource: Int) = LayoutInflater.from(context).inflate(
    layoutResource,this, false
)