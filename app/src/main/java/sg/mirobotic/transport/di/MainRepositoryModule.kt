package sg.mirobotic.transport.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import sg.mirobotic.transport.data.local.UserDataProvider
import sg.mirobotic.transport.data.remote.ApiHelper
import sg.mirobotic.transport.data.repository.MainRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainRepositoryModule {

    @Provides
    @Singleton
    fun provideMainRepository(apiHelper: ApiHelper, userDataProvider: UserDataProvider): MainRepository = MainRepository(apiHelper, userDataProvider)

}