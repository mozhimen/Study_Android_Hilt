package com.mozhimen.study_hilt

import android.os.Bundle
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVBVM
import com.mozhimen.study_hilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVBVM<ActivityMainBinding, MainViewModel>() {
    @Inject
    lateinit var bean: Bean

    override fun initView(savedInstanceState: Bundle?) {
        vb.mainTxt.text = bean.name
        vb.mainTxt1.text = vm.getString()
    }

    override fun bindViewVM(vb: ActivityMainBinding) {

    }
}