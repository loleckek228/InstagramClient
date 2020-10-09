package com.geekbrains.android.instagramclient.ui

import android.content.Context
import android.graphics.drawable.Drawable
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.model.IDrawableList

class DrawableList(private val context: Context) : IDrawableList {
    private var fruitDrawableList: MutableList<Drawable?> = mutableListOf()
    private var vegetablesDrawableList: MutableList<Drawable?> = mutableListOf()
    private var natureDrawableList: MutableList<Drawable?> = mutableListOf()

    init {
        addFruitDrawable()
        addVegetablesDrawable()
        addNatureDrawable()
    }

    private fun addFruitDrawable() {
        val image = context.getDrawable(R.drawable.fruits)

        fruitDrawableList.addAll(listOf(image, image, image, image, image, image, image, image, image))
    }

    private fun addVegetablesDrawable() {
        val image = context.getDrawable(R.drawable.vegetables)

        vegetablesDrawableList.addAll(listOf(image, image, image, image, image, image, image, image, image))
    }

    private fun addNatureDrawable() {
        val image = context.getDrawable(R.drawable.nature)

        natureDrawableList.addAll(listOf(image, image, image, image, image, image, image, image, image))
    }

    override fun getFruitDrawableList(): MutableList<Drawable?> = fruitDrawableList

    override fun getVegetableDrawableList(): MutableList<Drawable?> = vegetablesDrawableList

    override fun getNatureDrawableList(): MutableList<Drawable?> = natureDrawableList
}