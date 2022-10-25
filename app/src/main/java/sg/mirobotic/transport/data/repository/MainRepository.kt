package sg.mirobotic.transport.data.repository

import sg.mirobotic.transport.data.local.UserDataProvider
import sg.mirobotic.transport.data.remote.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiHelperAuth: ApiHelper,
    private val userDataProvider: UserDataProvider,
){

    suspend fun getArticles() =  apiHelperAuth.getArticles()

    suspend fun getCategories() =  apiHelperAuth.getCategories()

    suspend fun getArticleById(id: String) =  apiHelperAuth.getArticleById(id)

    suspend fun searchArticles(query: String) =  apiHelperAuth.searchArticles(query)

    suspend fun getProgramDetails(id: String) =  apiHelperAuth.getProgramDetails(userDataProvider.getAuthToken(), id)


}