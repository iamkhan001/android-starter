package sg.mirobotic.transport.data.local

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserDataProvider @Inject constructor(@ApplicationContext context : Context){

    private val preferences = context.getSharedPreferences("edu", Context.MODE_PRIVATE)

    var accessToken: String
        get() = preferences.getString("accessToken", "")!!
        set(value) = preferences.edit().putString("accessToken", value).apply()

    var refreshToken: String
        get() = preferences.getString("refreshToken", "")!!
        set(value) = preferences.edit().putString("refreshToken", value).apply()

    var password: String
        get() = preferences.getString("password", "")!!
        set(value) = preferences.edit().putString("password", value).apply()

    fun getAuthToken(): String = "Token $accessToken"

    fun saveAccount(account: Account) {
        preferences.edit().apply {
            putString("account_id", account.accountId)
            putString("firstName", account.firstName)
            putString("lastName", account.lastName)
            putString("photo", account.photo)
            putString("role", account.role)
            putString("email", account.email)
            putString("mobile", account.mobile)
            putString("schoolId", account.schoolId)
            putString("password", account.password)
            putBoolean("isActive", account.isActive)
            putBoolean("verified", account.verified)
            apply()
        }
    }


    fun getAccount(): Account = Account(
        accountId = preferences.getString("accountId", "")!!,
        firstName = preferences.getString("firstName", "")!!,
        lastName = preferences.getString("lastName", "")!!,
        photo = preferences.getString("photo", ""),
        role = preferences.getString("role", "")!!,
        email = preferences.getString("email", ""),
        mobile = preferences.getString("mobile", ""),
        schoolId = preferences.getString("schoolId", "")!!,
        isActive = preferences.getBoolean("isActive", false),
        verified = preferences.getBoolean("verified", false),
    )


    fun isLogin(): Boolean = preferences.getBoolean("is_login", false)

    fun isFirstLaunch(): Boolean = preferences.getBoolean("first_open", true)

    fun setFirstLaunch(b: Boolean) {
        preferences.edit().apply {
            putBoolean("first_open", b)
            apply()
        }
    }


}