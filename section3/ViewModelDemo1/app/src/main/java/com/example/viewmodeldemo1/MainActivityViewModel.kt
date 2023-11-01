package com.example.viewmodeldemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0;

    fun getCurrent(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}