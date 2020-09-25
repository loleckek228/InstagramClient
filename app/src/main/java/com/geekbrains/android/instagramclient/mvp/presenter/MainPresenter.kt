package com.geekbrains.android.instagramclient.mvp.presenter

import com.geekbrains.android.instagramclient.mvp.model.Model
import com.geekbrains.android.instagramclient.mvp.view.MainView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    private val model = Model()

    fun setUserName() {
        val name = model.getUser().name
        viewState.setUserName(name)
    }
}