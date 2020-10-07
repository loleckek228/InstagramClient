package com.geekbrains.android.instagramclient.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.MainPresenter
import com.geekbrains.android.instagramclient.ui.adapter.ImageRVAdapter
import kotlinx.android.synthetic.main.fragment_fruits.*
import moxy.MvpAppCompatFragment

class VegetablesFragment : MvpAppCompatFragment() {
    private lateinit var presenter: MainPresenter
    private lateinit var adapter: ImageRVAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_vegetables, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = MainPresenter()

        initRecyclerView()
    }

    private fun initRecyclerView() {
        image_recycler_view.layoutManager = LinearLayoutManager(context)
        adapter = ImageRVAdapter(presenter.getVegetablesImageListPresenter())
        image_recycler_view.adapter = adapter
    }
}