package com.geekbrains.android.instagramclient.ui.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.MainPresenter
import com.geekbrains.android.instagramclient.mvp.view.MainView
import com.geekbrains.android.instagramclient.ui.DrawableList
import com.geekbrains.android.instagramclient.ui.fragments.FruitsFragment
import com.geekbrains.android.instagramclient.ui.fragments.NatureFragment
import com.geekbrains.android.instagramclient.ui.fragments.TabVegetableFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView,
    NavigationView.OnNavigationItemSelectedListener {

    private val presenter: MainPresenter
            by moxyPresenter {
                MainPresenter(DrawableList(this))
            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        initNavigationDrawer()
        replaceFragment(FruitsFragment(presenter))
        setUserName()
    }

    private fun setUserName() {
        presenter.setUserName()
    }

    private fun initNavigationDrawer() {
        val toogle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val itemId: Int = item.itemId

        when (itemId) {
            R.id.nav_fruits -> {
                replaceFragment(FruitsFragment(presenter))
            }

            R.id.nav_vegetables -> {
                replaceFragment(TabVegetableFragment(presenter))
            }

            R.id.nav_nature -> {
                replaceFragment(NatureFragment(presenter))
            }

            else -> onNavigationItemSelected(item)
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }

    override fun setUserName(name: String) {
        val navUserName = nav_view?.getHeaderView(0)?.user_name_text_view
        navUserName?.text = name
    }
}