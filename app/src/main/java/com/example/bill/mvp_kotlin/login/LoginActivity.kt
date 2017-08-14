package com.example.bill.mvp_kotlin.login

import android.os.Bundle
import android.widget.Toast
import com.example.bill.mvp_kotlin.R
import com.example.bill.mvp_kotlin.base.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseMVPActivity<LoginView, BaseLoginPresenter>(), LoginView {

    override fun loginResult(result: Boolean) {
        if (result)
            showToast("Login Success")
        else
            showToast("Login Fail")
    }

    override fun initPresenter(): BaseLoginPresenter {
        return LoginPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        abtn_login.setOnClickListener {
            val user: String = aet_user_name.text.toString()
            val pwd: String = aet_pwd.text.toString()
            presenter.login(user, pwd)
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
