package com.blackson.n.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blackson.n.manager.FireBaseManager


/***
 * Created by n on 5-2-18.
 */
abstract class BaseFragment(@LayoutRes private val layoutId: Int) : Fragment() {

    internal val mFireBaseManager: FireBaseManager = FireBaseManager()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)

    }
}