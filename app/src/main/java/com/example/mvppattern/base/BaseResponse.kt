package com.example.mvppattern.base

import java.lang.Exception

data class BaseResponse<T>(var result: T?, var error: Exception?, var message: String){
    companion object{
        fun<T> success(data: T?): BaseResponse<T>{
            return BaseResponse(data, null, "success!")
        }

        fun<T> error(error: Exception) : BaseResponse<T>{
            return BaseResponse(null, error, "failed!")
        }
    }
}