package com.humblehacker.architecture

import android.app.Fragment
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater



/**
 * Created by david on 7/14/17.
 */
class FirstFragment: Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        view?.setBackgroundColor(Color.GRAY)
    }
}