package com.example.jocene.viewmodel.store

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.jocene.firebaseDatabase.FirebaseDb
import com.example.jocene.model.Store
import com.example.jocene.resource.Resource

class StoreViewModel(
    val firebaseDatabase: FirebaseDb
) : ViewModel() {
    private val _store = MutableLiveData<Resource<Store>>()
    val store: LiveData<Resource<Store>> = _store

    init {
        fetchStore()
    }

    private fun fetchStore() {
        _store.postValue(Resource.Loading())
        val uid = firebaseDatabase.userUid!!
        firebaseDatabase.fetchStore(uid).addOnCompleteListener { response ->
            if (response.isSuccessful) {
                val userStore = response.result.toObjects(Store::class.java).first()
                _store.postValue(Resource.Success(userStore))

            } else
                _store.postValue(Resource.Error(response.exception.toString()))
        }
    }

}