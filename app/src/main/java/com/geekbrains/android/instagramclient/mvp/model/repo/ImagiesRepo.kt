package com.geekbrains.android.instagramclient.mvp.model.repo

import com.geekbrains.android.instagramclient.mvp.model.DataSource
import com.geekbrains.android.instagramclient.mvp.model.entity.Image

class ImagiesRepo {
    private val dataSource = DataSource()

    fun getFruitImagies(): List<Image> {
        return dataSource.loadFruitImagies()
    }

    fun getVegetablesImagies(): List<Image> {
        return dataSource.loadVegetablesImagies()
    }

    fun getNatureImagies(): List<Image> {
        return dataSource.loadNatureImagies()
    }
}