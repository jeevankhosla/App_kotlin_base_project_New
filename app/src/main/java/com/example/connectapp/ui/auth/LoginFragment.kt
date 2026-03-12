package com.example.connectapp.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.connectapp.R
import com.example.connectapp.databinding.FragmentLoginBinding
import com.example.connectapp.ui.base.BaseFragment
import com.example.connectapp.ui.base.BaseViewModel
import com.example.connectapp.ui.main.MainActivity
import com.example.connectapp.ui.splash.WelcomeActivityVM
import com.example.connectapp.utils.ImageUtils
import okhttp3.Interceptor

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
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

    private fun initView() {
        viewModel.onClick.observe(viewLifecycleOwner, Observer {
            when (it?.id) {
                R.id.buttonLogin -> {
                   startActivity(Intent(requireContext(), MainActivity::class.java))
                    requireActivity().finishAffinity()
                }
                R.id.signUp -> {
                    ImageUtils.navigateWithSlideAnimations(findNavController(), R.id.navigateToSignupFragment)
                }
            }
        })
    }

    override fun getLayoutResource(): Int {
        return R.layout.fragment_login
    }

    override fun getViewModel(): BaseViewModel {
        return viewModel
    }


}