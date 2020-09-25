package com.geekbrains.android.instagramclient.mvp.presenter

import com.geekbrains.android.instagramclient.mvp.model.Model
import com.geekbrains.android.instagramclient.mvp.view.LogInView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class LogInPresenter : MvpPresenter<LogInView>() {
    private val model = Model()

    fun onEnterButtonClick(name: String) {
        if (name.isNullOrBlank()) {
            viewState.showSnackbar()
        } else {
            model.setUserName(name)
            viewState.enterToMainActivity()
        }
    }

    fun onExitButtonClick() {
        viewState.closeApp()
    }
}