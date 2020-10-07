package com.geekbrains.android.instagramclient.mvp.model

import com.geekbrains.android.instagramclient.mvp.model.entity.Image

class DataSource {
    private var fruitImagies: MutableList<Image> = mutableListOf()
    private var vegetablesImagies: MutableList<Image> = mutableListOf()
    private var natureImagies: MutableList<Image> = mutableListOf()

    init {
        addFruitImagies()
        addVegetablesImagies()
        addNatureImagies()
    }

    fun loadFruitImagies(): List<Image> {
        return fruitImagies
    }

    fun loadVegetablesImagies(): List<Image> {
        return vegetablesImagies
    }

    fun loadNatureImagies(): List<Image> {
        return natureImagies
    }

    private fun addFruitImagies() {
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
        fruitImagies.add(Image("Fruit1", false))
        fruitImagies.add(Image("Fruit2", true))
        fruitImagies.add(Image("Fruit3", false))
    }

    private fun addVegetablesImagies() {
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
        vegetablesImagies.add(Image("Vegetable1", true))
        vegetablesImagies.add(Image("Vegetable2", true))
        vegetablesImagies.add(Image("Vegetable3", false))
    }

    private fun addNatureImagies() {
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
        natureImagies.add(Image("Nature1", false))
        natureImagies.add(Image("Nature2", false))
        natureImagies.add(Image("Nature3", true))
    }
}