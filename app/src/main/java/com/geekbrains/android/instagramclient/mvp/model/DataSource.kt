package com.geekbrains.android.instagramclient.mvp.model

import android.graphics.drawable.Drawable
import com.geekbrains.android.instagramclient.mvp.model.entity.Image

class DataSource(private val drawableList: IDrawableList) {
    private var fruitImagies: MutableList<Image> = mutableListOf()
    private var vegetablesImagies: MutableList<Image> = mutableListOf()
    private var natureImagies: MutableList<Image> = mutableListOf()

    private lateinit var fruitDrawableList: List<Drawable?>
    private lateinit var vegetableDrawableList: List<Drawable?>
    private lateinit var natureDrawableList: List<Drawable?>

    init {
        addFruitImagies()
        addVegetablesImagies()
        addNatureImagies()
    }

    fun loadFruitImagies(): List<Image> = fruitImagies


    fun loadVegetablesImagies(): List<Image> = vegetablesImagies


    fun loadNatureImagies(): List<Image> = natureImagies


    private fun addFruitImagies() {
        fruitDrawableList = drawableList.getFruitDrawableList()

        fruitImagies.add(Image("Fruit1", fruitDrawableList.get(0), false))
        fruitImagies.add(Image("Fruit2", fruitDrawableList.get(1), true))
        fruitImagies.add(Image("Fruit3", fruitDrawableList.get(2), false))
        fruitImagies.add(Image("Fruit4", fruitDrawableList.get(3), false))
        fruitImagies.add(Image("Fruit5", fruitDrawableList.get(4), true))
        fruitImagies.add(Image("Fruit6", fruitDrawableList.get(5), false))
        fruitImagies.add(Image("Fruit7", fruitDrawableList.get(6), false))
        fruitImagies.add(Image("Fruit8", fruitDrawableList.get(7), true))
        fruitImagies.add(Image("Fruit9", fruitDrawableList.get(8), false))
    }

    private fun addVegetablesImagies() {
        vegetableDrawableList = drawableList.getVegetableDrawableList()

        vegetablesImagies.add(Image("Vegetable1", vegetableDrawableList.get(0), true))
        vegetablesImagies.add(Image("Vegetable2", vegetableDrawableList.get(1), true))
        vegetablesImagies.add(Image("Vegetable3", vegetableDrawableList.get(2), false))
        vegetablesImagies.add(Image("Vegetable4", vegetableDrawableList.get(3), true))
        vegetablesImagies.add(Image("Vegetable5", vegetableDrawableList.get(4), true))
        vegetablesImagies.add(Image("Vegetable6", vegetableDrawableList.get(5), false))
        vegetablesImagies.add(Image("Vegetable7", vegetableDrawableList.get(6), true))
        vegetablesImagies.add(Image("Vegetable8", vegetableDrawableList.get(7), true))
        vegetablesImagies.add(Image("Vegetable9", vegetableDrawableList.get(8), false))
    }

    private fun addNatureImagies() {
        natureDrawableList = drawableList.getNatureDrawableList()

        natureImagies.add(Image("Nature1", natureDrawableList.get(0), false))
        natureImagies.add(Image("Nature2", natureDrawableList.get(1), false))
        natureImagies.add(Image("Nature3", natureDrawableList.get(2), true))
        natureImagies.add(Image("Nature4", natureDrawableList.get(3), false))
        natureImagies.add(Image("Nature5", natureDrawableList.get(4), false))
        natureImagies.add(Image("Nature6", natureDrawableList.get(5), true))
        natureImagies.add(Image("Nature7", natureDrawableList.get(6), false))
        natureImagies.add(Image("Nature8", natureDrawableList.get(7), false))
        natureImagies.add(Image("Nature9", natureDrawableList.get(8), true))
    }
}