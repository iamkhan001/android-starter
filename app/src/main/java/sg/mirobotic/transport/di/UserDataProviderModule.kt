package sg.mirobotic.transport.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import sg.mirobotic.transport.data.local.UserDataProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UserDataProviderModule {

    @Provides
    @Singleton
    fun provideUserDataProvider(@ApplicationContext appContext: Context): UserDataProvider = UserDataProvider(appContext)

}