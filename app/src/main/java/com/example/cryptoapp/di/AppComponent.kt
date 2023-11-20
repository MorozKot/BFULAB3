package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.presentation.CoinDetailFragment
import com.example.cryptoapp.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class])
interface AppComponent {

    @Component.Factory
    interface AppComponentFactory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }

    fun createSubComponentFactory(): SubComponent.SubcomponentFactory
}