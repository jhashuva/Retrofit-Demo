package edu.cvr.kotlinretrofitdemo

import com.google.gson.annotations.SerializedName

data class MyDataItem(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)