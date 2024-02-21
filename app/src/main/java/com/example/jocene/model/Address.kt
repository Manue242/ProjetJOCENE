package com.example.jocene.model

import android.os.Parcelable

@Parcelize
data class Address(
    val addressTitle:String,
    val fullName:String,
    val street:String,
    val phone:String,
    val city:String,
    val state:String
) : Parcelable {
    constructor():this("","","","","","")
}

annotation class Parcelize
