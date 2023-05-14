package com.pr7.kotlin_send_object_activity_to_activity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User constructor(
 val fullname:String,
 val lastname:String
):Parcelable