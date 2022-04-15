package fr.quentin.android3.model

import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available") val available: Int,
    @SerializedName("collectionURI") val collectionURI: String,
    @SerializedName("returned") val returned: Int,
)

