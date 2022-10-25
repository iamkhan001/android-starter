package sg.mirobotic.transport.data.repository

import sg.mirobotic.transport.data.remote.ApiHelper
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val apiHelper: ApiHelper
){

    suspend fun signIn(map: HashMap<String, Any>) =  apiHelper.singIn(map)
}