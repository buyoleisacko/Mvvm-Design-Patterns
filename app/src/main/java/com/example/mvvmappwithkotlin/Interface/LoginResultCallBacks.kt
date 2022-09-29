package com.example.mvvmappwithkotlin.Interface

interface LoginResultCallBacks {
    fun onSuccess(message:String)
    fun onError(message: String)
}