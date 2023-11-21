package com.mozhimen.study_hilt.uis

import android.os.Bundle
import androidx.activity.viewModels
import com.mozhimen.basick.elemk.androidx.appcompat.bases.BaseActivityVB
import com.mozhimen.study_hilt.databinding.ActivityMainBinding
import com.mozhimen.study_hilt.mos.ActivityBean
import com.mozhimen.study_hilt.vms.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVB<ActivityMainBinding>() {
    @Inject
    lateinit var activityBean: ActivityBean

    @Inject
    lateinit var _factory: MainViewModel.Factory

    private val _vm: MainViewModel by viewModels {
        MainViewModel.provideMainViewModelFactory(_factory, "这是我要传进去的值")
    }

    override fun initView(savedInstanceState: Bundle?) {
        vb.vm = _vm
        vb.mainTxt.text = activityBean.name
        vb.mainTxt1.text = _vm.getCache()
        vb.mainTxt2.text = _vm.getRemote()
    }
}