package com.geekbrains.android.instagramclient.mvp.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface LogInView: MvpView {
    fun showSnackbar()
    fun enterToMainActivity()
}