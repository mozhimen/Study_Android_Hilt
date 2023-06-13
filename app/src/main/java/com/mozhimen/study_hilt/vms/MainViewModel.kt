package com.mozhimen.study_hilt.vms

import com.mozhimen.basick.elemk.viewmodel.bases.BaseViewModel
import com.mozhimen.study_hilt.commons.IGetValueListener
import com.mozhimen.study_hilt.helpers.CacheRepository
import com.mozhimen.study_hilt.helpers.RemoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

/**
 * @ClassName MainViewModel
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/7 11:27
 * @Version 1.0
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val _cacheRepository: CacheRepository, private val _remoteRepository: RemoteRepository, private val _getValueListener: IGetValueListener) :
    BaseViewModel() {
    fun getCache(): String = _cacheRepository.getCache()
    fun getRemote(): String = _remoteRepository.getRemote()

    private val _msfValue = MutableStateFlow(_getValueListener.onGetValue())
    val sfValue: StateFlow<String> = _msfValue
}