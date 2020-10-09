package com.geekbrains.android.instagramclient.ui.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.MainPresenter
import com.geekbrains.android.instagramclient.mvp.view.MainView
import com.geekbrains.android.instagramclient.ui.DrawableList
import com.geekbrains.android.instagramclient.ui.fragments.FruitsFragment
import com.geekbrains.android.instagramclient.ui.fragments.NatureFragment
import com.geekbrains.android.instagramclient.ui.fragments.VegetablesFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), MainView,
    NavigationView.OnNavigationItemSelectedListener {
    private val fragmentManager: FragmentManager = supportFragmentManager

    private val presenter: MainPresenter
            by moxyPresenter {
                MainPresenter(DrawableList(this))
            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        initNavigationDrawer()
        changeFragment(FruitsFragment(presenter))
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
                changeFragment(FruitsFragment(presenter))
            }

            R.id.nav_vegetables -> {
                changeFragment(VegetablesFragment(presenter))
            }

            R.id.nav_nature -> {
                changeFragment(NatureFragment(presenter))
            }

            else -> onNavigationItemSelected(item)
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.nav_host_fragment, fragment)
        fragmentTransaction.commit()
    }

    override fun setUserName(name: String) {
        val navUserName = nav_view?.getHeaderView(0)?.user_name_text_view
        navUserName?.text = name
    }
}