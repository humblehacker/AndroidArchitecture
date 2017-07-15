package com.humblehacker.architecture

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by david on 7/14/17.
 */
class MainViewModel: ViewModel()
{
    override fun onCleared()
    {
        super.onCleared()
    }

    var firstText: MutableLiveData<String> = MutableLiveData()
    var secondText: MutableLiveData<String> = MutableLiveData()
}