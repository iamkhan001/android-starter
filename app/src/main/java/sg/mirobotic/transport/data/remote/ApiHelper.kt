package sg.mirobotic.transport.data.remote

import okhttp3.ResponseBody
import retrofit2.Response

interface ApiHelper {

    suspend fun getArticles(): Response<ResponseBody>

    suspend fun getCategories(): Response<ResponseBody>

    suspend fun getArticleById(id: String): Response<ResponseBody>

    suspend fun searchArticles(query: String): Response<ResponseBody>

    suspend fun getProgramDetails(token: String, id: String): Response<ResponseBody>

    suspend fun singIn(map: HashMap<String, Any>): Response<ResponseBody>

}