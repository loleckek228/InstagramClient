package com.geekbrains.android.instagramclient.mvp.presenter

import com.geekbrains.android.instagramclient.mvp.view.list.ImageRowView

interface IImageListPresenter {
    fun bind(view: ImageRowView);
    fun getCount(): Int
}