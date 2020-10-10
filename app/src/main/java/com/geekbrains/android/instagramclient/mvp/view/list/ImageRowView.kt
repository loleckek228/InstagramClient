package com.geekbrains.android.instagramclient.mvp.view.list

import android.graphics.drawable.Drawable

interface ImageRowView {
    fun getPos(): Int
    fun setTitle(title: String)
    fun setImage(title: Drawable?)
    fun isElect(isElect: Boolean)
}