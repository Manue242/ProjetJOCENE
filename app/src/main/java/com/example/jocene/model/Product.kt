package com.example.jocene.model

import android.os.Parcel
import android.os.Parcelable
import java.util.Date


@Parcelize
data class Product(
    val id :Int,
    val title: String? = "",
    val description: String? = "",
    val category: String? = "",
    val newPrice:String?="",
    val price: String? = "",
    val seller: String? = "",

    val images:@RawValue HashMap<String, Any>?=null,
    val colors:@RawValue HashMap<String, Any>?=null,
    val sizes:@RawValue HashMap<String, Any>?=null,
    val orders:Int = 0,
    val offerTime:Date? = null,
    val sizeUnit:String?=null

) : Parcelable
    {
        constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            TODO("images"),
            TODO("colors"),
            TODO("sizes"),
            parcel.readInt(),
            TODO("offerTime"),
            parcel.readString()
        ) {
        }

        constructor(
         id :Int,
         title: String? = "",
         description: String? = "",
         category: String? = "",
         price: String? = "",
         seller: String? = "",
         images: HashMap<String, Any>,
         colors: HashMap<String, Any>,
         sizes: HashMap<String, Any>
    ) : this(id,title,description,category,null,price,seller, images, colors, sizes,0,null,null)

    constructor():this(0,"","","","",null,null,null)

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(id)
            parcel.writeString(title)
            parcel.writeString(description)
            parcel.writeString(category)
            parcel.writeString(newPrice)
            parcel.writeString(price)
            parcel.writeString(seller)
            parcel.writeInt(orders)
            parcel.writeString(sizeUnit)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Product> {
            override fun createFromParcel(parcel: Parcel): Product {
                return Product(parcel)
            }

            override fun newArray(size: Int): Array<Product?> {
                return arrayOfNulls(size)
            }
        }
    }
