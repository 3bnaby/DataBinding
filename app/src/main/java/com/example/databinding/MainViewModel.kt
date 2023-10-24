package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val loading = MutableLiveData<Boolean>(true)
    fun stopLoading(){
        loading.postValue(false)
    }

}