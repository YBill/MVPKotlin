package com.example.bill.mvp_kotlin.login

import android.text.TextUtils

/**
 * Created by Bill on 2017/8/14.
 */
class LoginPresenter : BaseLoginPresenter() {

    override fun login(userName: String, passWord: String) {
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(passWord)) {
            mView?.loginResult(true)
        } else {
            mView?.loginResult(false)
        }
    }


}