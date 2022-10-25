package sg.mirobotic.transport.data.remote

import com.google.gson.annotations.SerializedName
import sg.mirobotic.transport.data.local.Account

data class LoginResponse (
    @SerializedName("account") val account: Account? = null,
    @SerializedName("access") val accessToken: String? = "",
    @SerializedName("refresh") val refreshToken: String? = "",
    val status: String? = ""
)