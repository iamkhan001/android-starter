package sg.mirobotic.transport.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import sg.mirobotic.transport.data.local.UserDataProvider
import sg.mirobotic.transport.data.local.db.AppDatabase
import sg.mirobotic.transport.data.repository.MainRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userDataProvider: UserDataProvider,
    private val mainRepository: MainRepository,
    private val appDatabase: AppDatabase,
):ViewModel(){

    var isInternetAvailable = false


}