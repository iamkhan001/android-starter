package sg.mirobotic.transport.data.remote

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("wowtam/public/index.php/post/")
    suspend fun getArticles(
        @Query("tags") tags: String? = null
    ): Response<ResponseBody>

    @GET("wowtam/public/index.php/post/")
    suspend fun searchArticles(
        @Query("search") search: String
    ): Response<ResponseBody>

    @GET("wowtam/public/index.php/post/")
    suspend fun getArticlesById(@Query("categories") categories: String): Response<ResponseBody>

    @GET("wowtam/public/index.php/categories/")
    suspend fun getCategories(): Response<ResponseBody>

    @GET("school/program")
    suspend fun getProgramDetails(@Header("Authorization") token: String, @Query("id") id: String): Response<ResponseBody>

    @POST("account/sign-in/")
    suspend fun signIn(@Body map: HashMap<String, Any>): Response<ResponseBody>


}