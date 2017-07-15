package com.humblehacker.architecture

import android.arch.lifecycle.LifecycleFragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.second_fragment.*

/**
 * Created by david on 7/14/17.
 */
class SecondFragment: LifecycleFragment()
{
    private lateinit var viewModel: MainViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?)
    {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

        viewModel.secondText.observe(this, Observer(
                {
                    text ->
                    if (text != null) et_second.setText(text, TextView.BufferType.EDITABLE)
                }))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause()
    {
        super.onPause()
        viewModel.secondText.value = et_second.text?.toString()
    }
}