package com.example.cryptoapp.di

import com.example.cryptoapp.presentation.CoinDetailFragment
import com.example.cryptoapp.presentation.CoinPriceListActivity
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface SubComponent {

    fun inject(activity: CoinPriceListActivity)

    fun inject(fragment: CoinDetailFragment)

    @Subcomponent.Factory
    interface SubcomponentFactory {

        fun create(): SubComponent
    }
}