package com.example.mvvmappwithkotlin.View

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmappwithkotlin.Interface.LoginResultCallBacks
import com.example.mvvmappwithkotlin.R
import com.example.mvvmappwithkotlin.ViewModel.LoginViewModel
import com.example.mvvmappwithkotlin.ViewModel.LoginViewModelFactory
import com.example.mvvmappwithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LoginResultCallBacks {

    override fun onSuccess(message: String) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModel =
            ViewModelProvider(this).get(LoginViewModelFactory::class.java)
                .get(LoginViewModel::class.java)
    }

}

private fun ViewModelProvider.get(modelClass: Class<LoginViewModelFactory>): LoginViewModelFactory {
    TODO("Not yet implemented")
}
