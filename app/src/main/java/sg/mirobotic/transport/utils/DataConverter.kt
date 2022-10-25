package sg.mirobotic.transport.utils

import android.accounts.Account
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import org.json.JSONObject
import sg.mirobotic.transport.data.local.Category

object DataConverter {

    private val gson = Gson()

    fun toAccount(jsonObject: JSONObject): Account = gson.fromJson(jsonObject.toString(), Account::class.java)

    fun toCategories(obj: JSONArray): ArrayList<Category> {
        val typeToken = object : TypeToken<ArrayList<Category>>() {}.type
        return gson.fromJson(obj.toString(), typeToken)
    }


    fun getErrorResponse(error: String): String {
        try {
            val obj = JSONObject(error)
            return obj.getString("msg")
        }catch (e: Exception) {

        }
        return "Error"
    }

}