package com.blackson.n.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.annotation.NonNull
import android.support.v7.app.AppCompatActivity
import com.blackson.n.R

/***
 * Created by n on 5-2-18.
 */
abstract class BaseActivity(@LayoutRes private val layoutId: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    protected fun openFragment(@NonNull pFragment: BaseFragment, pAddToBackStack: Boolean) {

        // Check if the current fragment is the one we are trying to go to
        val count = supportFragmentManager.backStackEntryCount
        if (count > 0 && supportFragmentManager.getBackStackEntryAt(count - 1).name == pFragment::class.toString()) {
            // If so, return & don't add a new instance
            return
        }
        // Begin the transaction, add the fragment to the activity's container
        val transaction = supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, pFragment)

        // Add to the back stack
        if (pAddToBackStack) {
            transaction.addToBackStack(pFragment::class.toString())
        }

        // Commit the transaction
        transaction.commit()
    }
}