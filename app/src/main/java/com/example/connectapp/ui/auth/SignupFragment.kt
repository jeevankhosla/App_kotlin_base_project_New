package com.example.connectapp.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.connectapp.R
import com.example.connectapp.databinding.FragmentLoginBinding
import com.example.connectapp.databinding.FragmentSignupBinding
import com.example.connectapp.ui.base.BaseFragment
import com.example.connectapp.ui.base.BaseViewModel
import com.example.connectapp.ui.splash.WelcomeActivityVM

class SignupFragment : BaseFragment<FragmentSignupBinding>() {
    private val viewModel: AuthCommonVM by viewModels()

    override fun onCreateView(view: View) {
        initView()
        initOnClick()
        initObserver()
    }

    private fun initObserver() {

    }

    private fun initOnClick() {

    }


    override fun getLayoutResource(): Int {
        return R.layout.fragment_signup
    }

    override fun getViewModel(): BaseViewModel {
        return viewModel
    }

    private fun initView() {
        viewModel.onClick.observe(viewLifecycleOwner, Observer {
            when (it?.id) {
                R.id.buttonSignup -> {
                  onBackPressed()
                }
            }
        })
    }

}