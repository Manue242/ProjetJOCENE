package com.example.jocene.viewmodel.store

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jocene.firebaseDatabase.FirebaseDb

class StoreViewModelProviderFactory(
    val db:FirebaseDb
) : ViewModelProvider.Factory {
    fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return StoreViewModel(db) as T
    }
}