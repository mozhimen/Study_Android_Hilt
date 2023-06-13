package com.mozhimen.study_hilt.dis

import com.mozhimen.study_hilt.commons.GetValueCallback
import com.mozhimen.study_hilt.commons.IGetValueListener
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @ClassName AbsSingletonModule
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/13 11:54
 * @Version 1.0
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class AbsSingletonModule {

    @Binds
    @Singleton
    abstract fun bindIGetValueListener(getValueCallback: GetValueCallback): IGetValueListener
}