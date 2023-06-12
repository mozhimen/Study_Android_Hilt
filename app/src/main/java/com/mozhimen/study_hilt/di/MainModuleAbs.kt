package com.mozhimen.study_hilt.di

import com.mozhimen.study_hilt.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @ClassName Repository
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/12 17:49
 * @Version 1.0
 */
@Module
@InstallIn(SingletonComponent::class)
class MainModuleAbs {

    @Singleton
    @Provides
    fun provideRepository(): Repository = Repository()
}