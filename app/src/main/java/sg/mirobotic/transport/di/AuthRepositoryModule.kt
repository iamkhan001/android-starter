package sg.mirobotic.transport.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import sg.mirobotic.transport.data.remote.ApiHelper
import sg.mirobotic.transport.data.repository.AuthRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthRepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(apiHelper: ApiHelper): AuthRepository = AuthRepository(apiHelper)

}