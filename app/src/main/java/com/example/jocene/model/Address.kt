package com.example.jocene.model

import android.os.Parcel
import android.os.Parcelable

@Parcelize
data class Address(
    val addressTitle: String?,
    val fullName: String?,
    val street: String?,
    val phone: String?,
    val city: String?,
    val state: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    constructor():this("","","","","","")

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(addressTitle)
        parcel.writeString(fullName)
        parcel.writeString(street)
        parcel.writeString(phone)
        parcel.writeString(city)
        parcel.writeString(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Address> {
        override fun createFromParcel(parcel: Parcel): Address {
            return Address(parcel)
        }

        override fun newArray(size: Int): Array<Address?> {
            return arrayOfNulls(size)
        }
    }
}

annotation class Parcelize
