package com.mozhimen.study_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @ClassName Repository
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/12 17:49
 * @Version 1.0
 */
@Module
@InstallIn(ViewModelComponent::class)
class Repository {

    @ViewModelScoped
    @Provides
    fun provideTest(): String =
        "hello"
}