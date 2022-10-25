package sg.mirobotic.transport.data.remote

import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl  @Inject constructor(
    private val apiService: ApiService
): ApiHelper {

    override suspend fun getArticles(): Response<ResponseBody> = apiService.getArticles()

    override suspend fun getCategories(): Response<ResponseBody> = apiService.getCategories()

    override suspend fun getArticleById(id: String): Response<ResponseBody> = apiService.getArticlesById(id)

    override suspend fun searchArticles(query: String): Response<ResponseBody> = apiService.searchArticles(query)

    override suspend fun getProgramDetails(token: String, id: String): Response<ResponseBody> = apiService.getProgramDetails(token, id)

    override suspend fun singIn(map: HashMap<String, Any>): Response<ResponseBody> = apiService.signIn(map)

}