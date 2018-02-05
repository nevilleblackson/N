package com.blackson.n.fragments

import com.blackson.n.R
import com.blackson.n.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*

/***
 * Created by n on 5-2-18.
 */
class LoginFragment : BaseFragment(R.layout.fragment_login) {

    override fun onStart() {
        super.onStart()
        initClickListeners()
    }


    private fun initClickListeners() {
        nextButton.setOnClickListener {

        }
    }
}