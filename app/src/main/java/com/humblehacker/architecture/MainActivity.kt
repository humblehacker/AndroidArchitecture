package com.humblehacker.architecture

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : LifecycleActivity()
{
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        button_first.setOnClickListener { setFirstFragment() }
        button_second.setOnClickListener { setSecondFragment() }
        button_other.setOnClickListener { showOtherActivity() }

        if (savedInstanceState == null)
        {
            addFirstFragment()
        }
    }

    private fun showOtherActivity()
    {
        val intent = Intent(this, OtherActivity::class.java)
        startActivity(intent)
    }

    private fun addFirstFragment()
    {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, FirstFragment())
        transaction.commit()
    }

    private fun setFirstFragment()
    {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, FirstFragment())
        transaction.commit()
    }

    private fun setSecondFragment()
    {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, SecondFragment())
        transaction.commit()
    }
}
