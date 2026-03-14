package com.example.connectapp.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat.startActivity
import androidx.core.os.LocaleListCompat
import androidx.databinding.BindingAdapter
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.example.connectapp.R
import com.google.gson.Gson

object ImageUtils {
    fun navigateWithSlideAnimations(navController: NavController, destinationId: Int) {
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_right) // Define enter animation
            .setExitAnim(R.anim.slide_out_left) // Define exit animation
            .setPopEnterAnim(R.anim.slide_in_left) // Define pop enter animation
            .setPopExitAnim(R.anim.slide_out_right) // Define pop exit animation
            .build()

        navController.navigate(destinationId, null, navOptions)
    }

    fun goActivity(context: Context, activity: Activity) {
        val intent = Intent(context, activity::class.java)
        startActivity(context, intent, null)


    }

    inline fun <reified T> parseJson(json: String): T? {
        return try {
            val gson = Gson()
            gson.fromJson(json, T::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun setAppLanguage(languageCode: String) {
        val appLocale = LocaleListCompat.forLanguageTags(languageCode)
        AppCompatDelegate.setApplicationLocales(appLocale)
    }

}