package com.example.cryptoapp

import android.app.Application
import com.example.cryptoapp.di.DaggerAppComponent

class CoinApp: Application() {

    val component by lazy {
        DaggerAppComponent.factory()
            .create(this)
    }
}