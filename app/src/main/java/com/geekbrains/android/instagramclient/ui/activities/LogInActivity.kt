package com.geekbrains.android.instagramclient.ui.activities

import android.content.Intent
import android.os.Bundle
import com.geekbrains.android.instagramclient.R
import com.geekbrains.android.instagramclient.mvp.presenter.LogInPresenter
import com.geekbrains.android.instagramclient.mvp.view.LogInView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class LogInActivity : MvpAppCompatActivity(), LogInView {

    @InjectPresenter
    lateinit var presenter: LogInPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        onButtonClickBehavior()
    }

    private fun onButtonClickBehavior() {
        enter_button.setOnClickListener {
            presenter.onEnterButtonClick(name_edit_text.text.toString())
        }

        exit_button.setOnClickListener {
            presenter.onExitButtonClick()
        }
    }

    override fun showSnackbar() {
        val contextView = enter_button

        Snackbar.make(contextView, R.string.field_name_is_empty, Snackbar.LENGTH_LONG)
            .show()
    }

    override fun enterToMainActivity() {
        val intent = Intent(this@LogInActivity, MainActivity::class.java)
        startActivity(intent)
    }

    override fun closeApp() {
        finish()
    }
}