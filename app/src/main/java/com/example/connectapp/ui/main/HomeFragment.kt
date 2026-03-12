package com.example.connectapp.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.connectapp.R
import com.example.connectapp.databinding.FragmentHomeBinding
import com.example.connectapp.ui.auth.AuthCommonVM
import com.example.connectapp.ui.base.BaseFragment
import com.example.connectapp.ui.base.BaseViewModel
import com.example.connectapp.utils.ImageUtils
import kotlin.getValue

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private val viewModel: MainVm by viewModels()

    override fun getLayoutResource(): Int {
        return R.layout.fragment_home
    }

    override fun getViewModel(): BaseViewModel {
        return viewModel
    }

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

            }
        })
    }

}