package com.geekbrains.android.instagramclient.mvp.presenter

import com.geekbrains.android.instagramclient.mvp.view.LogInView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class LogInPresenter : MvpPresenter<LogInView>() {
    fun onEnterButtonClick(text: String) {
        if (text.isNullOrBlank()) {
            viewState.showSnackbar()
        } else {
            viewState.enterToMainActivity()
        }
    }

    fun onExitButtonClick() {
        viewState.closeApp()
    }
}