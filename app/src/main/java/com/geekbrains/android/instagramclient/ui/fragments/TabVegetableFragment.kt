package com.geekbrains.android.instagramclient.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.MainPresenter
import com.geekbrains.android.instagramclient.ui.adapter.TabAdapter
import com.geekbrains.android.instagramclient.ui.fragments.tabs.*
import kotlinx.android.synthetic.main.fragmemt_tab_vegetable.*
import moxy.MvpAppCompatFragment

class TabVegetableFragment(private val presenter: MainPresenter) : MvpAppCompatFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmemt_tab_vegetable, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragment1 = VegetableFragment1(presenter).newInstance(null)
        val fragment2 = VegetableFragment2().newInstance(null)
        val fragment3 = VegetableFragment3().newInstance(null)

        val tabAdapter = TabAdapter(activity?.supportFragmentManager)
        tabAdapter.addFragment(fragment1, "Vegetable1")
        tabAdapter.addFragment(fragment2, "Vegetable2")
        tabAdapter.addFragment(fragment3, "Vegetable3")

        view_pager.apply {
            adapter = tabAdapter
        }

        tabs_layout.apply {
            setupWithViewPager(view_pager)
        }
    }
}