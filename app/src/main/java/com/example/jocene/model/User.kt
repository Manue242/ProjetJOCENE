package com.example.jocene.model

import android.os.Parcelable

@Parcelize
data class User(
    var firstName:String,
    var lastName:String,
    var email:String,
    var imagePath:String=""
):Parcelable{

    constructor() : this("","","")
}
