package com.mozhimen.study_hilt.dis

import com.mozhimen.study_hilt.helpers.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @ClassName ActivityModule
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/13 11:42
 * @Version 1.0
 */
@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {

    @ViewModelScoped
    @Provides
    fun providerRemoteRepository(): RemoteRepository = RemoteRepository()
}