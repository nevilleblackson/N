package com.blackson.n.base

import android.app.DialogFragment
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/***
 * Created by n on 5-2-18.
 */
abstract class BaseDialog(@LayoutRes private val layoutId: Int) : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)
    }
}