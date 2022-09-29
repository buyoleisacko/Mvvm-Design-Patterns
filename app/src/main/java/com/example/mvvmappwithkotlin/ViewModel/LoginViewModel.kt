package com.example.mvvmappwithkotlin.ViewModel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmappwithkotlin.Interface.LoginResultCallBacks
import com.example.mvvmappwithkotlin.Model.User

class LoginViewModel(private val listener: LoginResultCallBacks) : ViewModel() {
    private val user: User = User("", "")

    //Create function to set email after user finish enter text
    val emailTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                user.setEmail(s.toString())
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        }

    //create function to set password after user finish enter text

    val passwordTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                user.setPassword(s.toString())
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        }

    //create function to process login button when clicked

    fun onLoginClicked(v: View) {
        if (user.isDataValid)
            listener.onSuccess("Login Success")
        else
            listener.onError("Login failed")
    }
}