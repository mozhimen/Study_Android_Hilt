package com.mozhimen.study_hilt

import android.os.Bundle
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVBVM
import com.mozhimen.study_hilt.databinding.ActivityMainBinding
import com.mozhimen.study_hilt.mos.ActivityBean
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVBVM<ActivityMainBinding, MainViewModel>() {
    @Inject
    lateinit var activityBean: ActivityBean

    override fun initView(savedInstanceState: Bundle?) {
        vb.mainTxt.text = activityBean.name
        vb.mainTxt1.text = vm.getCache()
        vb.mainTxt2.text = vm.getRemote()
        vb.mainTxt3.text = vm.getValue()
    }

    override fun bindViewVM(vb: ActivityMainBinding) {

    }
}