package com.geekbrains.android.instagramclient.mvp.model

import android.graphics.drawable.Drawable

interface IDrawableList {
    fun getFruitDrawableList(): MutableList<Drawable?>
    fun getVegetableDrawableList(): MutableList<Drawable?>
    fun getNatureDrawableList(): MutableList<Drawable?>
}