package com.geekbrains.android.instagramclient.mvp.presenter

import com.geekbrains.android.instagramclient.mvp.model.DataSource
import com.geekbrains.android.instagramclient.mvp.model.Model
import com.geekbrains.android.instagramclient.mvp.model.entity.Image
import com.geekbrains.android.instagramclient.mvp.model.repo.ImagiesRepo
import com.geekbrains.android.instagramclient.mvp.view.MainView
import com.geekbrains.android.instagramclient.mvp.view.list.ImageRowView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    class ImageListPresenter : IImageListPresenter {
        var imagies = mutableListOf<Image>()

        override fun bind(view: ImageRowView) {
            val image = imagies.get(view.getPos())

            view.setImage(image.image)
        }

        override fun getCount(): Int {
            return imagies.size
        }
    }

    private var model: Model = Model()
    private var imagiesRepo: ImagiesRepo = ImagiesRepo()
    private var fruitImageListPresenter: ImageListPresenter
    private var vegetablesImageListPresenter: ImageListPresenter
    private var natureImageListPresenter: ImageListPresenter

    init {
        fruitImageListPresenter = ImageListPresenter()
        vegetablesImageListPresenter = ImageListPresenter()
        natureImageListPresenter = ImageListPresenter()

        loadFruitImagies()
        loadVegetablesImagies()
        loadNatureImagies()
    }

    fun getFruitImageListPresenter(): IImageListPresenter = fruitImageListPresenter
    fun getVegetablesImageListPresenter(): IImageListPresenter = vegetablesImageListPresenter
    fun getNatureImageListPresenter(): IImageListPresenter = natureImageListPresenter

    private fun loadFruitImagies() {
        fruitImageListPresenter.imagies.clear()
        fruitImageListPresenter.imagies.addAll(imagiesRepo.getFruitImagies())
    }

    private fun loadVegetablesImagies() {
        vegetablesImageListPresenter.imagies.clear()
        vegetablesImageListPresenter.imagies.addAll(imagiesRepo.getVegetablesImagies())
    }

    private fun loadNatureImagies() {
        natureImageListPresenter.imagies.clear()
        natureImageListPresenter.imagies.addAll(imagiesRepo.getNatureImagies())
    }

    fun setUserName() {
        val name = model.getUser().name
        viewState.setUserName(name)
    }
}