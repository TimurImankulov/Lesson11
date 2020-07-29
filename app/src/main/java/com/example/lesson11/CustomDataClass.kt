package com.example.lesson11

import android.icu.text.CaseMap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class CustomDataClass (
    val title: String
):Parcelable