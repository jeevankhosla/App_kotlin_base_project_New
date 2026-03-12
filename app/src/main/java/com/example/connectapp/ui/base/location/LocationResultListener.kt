package com.example.connectapp.ui.base.location
import android.location.Location

interface LocationResultListener {
    fun getLocation(location: Location)
}