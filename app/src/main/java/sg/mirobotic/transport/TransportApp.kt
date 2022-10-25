package sg.mirobotic.transport

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@HiltAndroidApp
class TransportApp: Application() {

    companion object {
        lateinit var instance: TransportApp
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }

}