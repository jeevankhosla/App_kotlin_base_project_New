package com.example.connectapp.ui.splash

import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.connectapp.R
import com.example.connectapp.databinding.ActivityWelcomeBinding
import com.example.connectapp.ui.base.BaseActivity
import com.example.connectapp.ui.base.BaseViewModel
import com.example.connectapp.utils.ImageUtils.setAppLanguage
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WelcomeActivity : BaseActivity<ActivityWelcomeBinding>() {
    private val viewModel: WelcomeActivityVM by viewModels()
    private val navController: NavController by lazy {
        (supportFragmentManager.findFragmentById(R.id.mainNavigationHost) as NavHostFragment).navController
    }

    override fun getLayoutResource(): Int {
        return R.layout.activity_welcome
    }

    override fun getViewModel(): BaseViewModel {
        return viewModel
    }

    override fun onCreateView() {

        setAppLanguage("ar")

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                navController.graph =
                    navController.navInflater.inflate(R.navigation.auth_navigation).apply {
                        setStartDestination(R.id.fragmentLogin)
                    }
            }
        }
    }
}