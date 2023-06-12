package com.mozhimen.study_hilt

import com.mozhimen.basick.elemk.viewmodel.bases.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @ClassName MainViewModel
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/7 11:27
 * @Version 1.0
 */
@HiltViewModel
class MainViewModel @Inject constructor() : BaseViewModel()