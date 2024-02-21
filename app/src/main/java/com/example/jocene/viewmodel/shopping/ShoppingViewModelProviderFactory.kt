package com.example.jocene.viewmodel.shopping

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jocene.firebaseDatabase.FirebaseDb

class ShoppingViewModelProviderFactory(
    val db:FirebaseDb
) : ViewModelProvider.Factory {
    fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(db) as T
    }
}