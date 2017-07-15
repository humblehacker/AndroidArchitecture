package com.humblehacker.architecture

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, FirstFragment())
        transaction.commit()

        button_first.setOnClickListener { setFirstFragment() }
        button_second.setOnClickListener { setSecondFragment() }
        button_other.setOnClickListener { showOtherFragment() }
    }

    private fun showOtherFragment()
    {
        val intent = Intent(this, OtherActivity::class.java)
        startActivity(intent)
    }

    private fun setSecondFragment()
    {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, SecondFragment())
        transaction.commit()
    }

    private fun setFirstFragment()
    {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, FirstFragment())
        transaction.commit()
    }
}
