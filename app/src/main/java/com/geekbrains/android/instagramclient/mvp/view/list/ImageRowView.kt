package com.geekbrains.android.instagramclient.mvp.view.list

interface ImageRowView {
    fun getPos(): Int
    fun setImage(title: String)
}