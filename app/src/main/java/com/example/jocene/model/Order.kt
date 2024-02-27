package com.example.jocene.model

import android.os.Parcel
import android.os.Parcelable
import java.util.Date

@Parcelize
data class Order(
    val id: String,
    val date:Date,
    val totalPrice:String,
    val state:String
):Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        TODO("date"),
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    constructor():this("",Date(),"","")

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(totalPrice)
        parcel.writeString(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Order> {
        override fun createFromParcel(parcel: Parcel): Order {
            return Order(parcel)
        }

        override fun newArray(size: Int): Array<Order?> {
            return arrayOfNulls(size)
        }
    }
}