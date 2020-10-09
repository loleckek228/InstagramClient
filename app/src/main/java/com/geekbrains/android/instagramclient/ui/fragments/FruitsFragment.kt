package com.geekbrains.android.instagramclient.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.MainPresenter
import com.geekbrains.android.instagramclient.ui.adapter.ImageRVAdapter
import kotlinx.android.synthetic.main.fragment_fruits.*
import moxy.MvpAppCompatFragment

class FruitsFragment(private val presenter: MainPresenter) : MvpAppCompatFragment() {
    private lateinit var adapterRV: ImageRVAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fruits, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapterRV = ImageRVAdapter(presenter.getFruitImageListPresenter())

        image_recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRV
        }
    }
}   