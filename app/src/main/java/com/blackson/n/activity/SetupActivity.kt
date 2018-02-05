package com.blackson.n.activity

import com.blackson.n.R
import com.blackson.n.base.BaseActivity
import com.blackson.n.fragments.LoginFragment

/***
 * Created by n on 5-2-18.
 */
class SetupActivity : BaseActivity(R.layout.activity_setup) {

    override fun onStart() {
        super.onStart()
        openFragment(LoginFragment(), false)
    }
}