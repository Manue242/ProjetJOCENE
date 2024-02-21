package com.example.jocene.model

import android.os.Parcelable

@Parcelize
data class CartProductsList(
    val products: @RawValue List<CartProduct>
) : Parcelable {


}

@Target(AnnotationTarget.TYPE)
annotation class RawValue
