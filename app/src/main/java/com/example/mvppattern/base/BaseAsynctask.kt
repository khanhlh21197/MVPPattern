package com.example.mvppattern.base

import android.os.AsyncTask
import java.lang.Exception

abstract class BaseAsynctask<Params, Progress, Result> : AsyncTask<Params, Progress, BaseResponse<Result>>(){

    override fun doInBackground(vararg params: Params): BaseResponse<Result> {
        return try {
            BaseResponse.success(onBackground(*params))
        }catch (e: Exception){
            BaseResponse.error(e)
        }
    }

    override fun onPostExecute(result: BaseResponse<Result>?) {
        result?.error?.let {
            onFailure(it)
        }
        result?.result?.let {
            onResult(it)
        }
        super.onPostExecute(result)
    }

    protected abstract fun onBackground(vararg params: Params): Result

    protected abstract fun onResult(result: Result)

    protected abstract fun onFailure(result: Throwable)

}