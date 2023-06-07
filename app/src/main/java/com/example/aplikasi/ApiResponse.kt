package com.example.aplikasi

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("predicted_name")
    val predictedName: String
)
