package com.example.bill.mvp_kotlin.login

import com.example.bill.mvp_kotlin.base.BasePresenter
import com.example.bill.mvp_kotlin.base.BaseView

/**
 * Created by Bill on 2017/8/14.
 */
interface LoginView : BaseView {
    fun loginResult(result: Boolean)
}

abstract class BaseLoginPresenter : BasePresenter<LoginView>() {
    abstract fun login(userName: String, passWord: String)
}

