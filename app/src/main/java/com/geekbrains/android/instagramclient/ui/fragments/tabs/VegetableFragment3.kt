package com.geekbrains.android.instagramclient.ui.fragments.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geekbrains.android.instagramclient.R
import moxy.MvpAppCompatFragment

class VegetableFragment3 : MvpAppCompatFragment() {
    fun newInstance(bundle: Bundle?): VegetableFragment3 {
        val fragment = VegetableFragment3()

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
        return inflater.inflate(R.layout.fragment_vegetable3, container, false)
    }
}