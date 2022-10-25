package sg.mirobotic.transport.data.local

import com.google.gson.annotations.SerializedName

data class Account(
    @SerializedName("account_id") val accountId: String,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    @SerializedName("photo") val photo: String?,
    @SerializedName("role") val role: String,
    @SerializedName("school_id") val schoolId: String,
    @SerializedName("mobile") val mobile: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("is_active") val isActive: Boolean,
    @SerializedName("verified") val verified: Boolean,
) {
    var password = ""
}