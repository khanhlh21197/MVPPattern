package com.example.mvppattern.exceptions

import java.lang.Exception

data class ServiceException(val messageKey: String) : Exception()