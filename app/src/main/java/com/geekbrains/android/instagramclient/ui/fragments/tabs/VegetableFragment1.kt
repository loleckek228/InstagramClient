package com.geekbrains.android.instagramclient.ui.fragments.tabs

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

class VegetableFragment1(private val presenter: MainPresenter) : MvpAppCompatFragment() {
    private lateinit var adapterRV: ImageRVAdapter

    fun newInstance(bundle: Bundle?): VegetableFragment1 {
        val fragment = VegetableFragment1(presenter)

        val args = Bundle()
        args.putBundle("gettedArgs", bundle)

        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_vegetable1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.setTitle(R.string.vegetables_title)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapterRV = ImageRVAdapter(presenter.getVegetablesImageListPresenter())

        image_recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRV
        }
    }
}