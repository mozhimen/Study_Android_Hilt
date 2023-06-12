package com.mozhimen.study_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVB
import com.mozhimen.basick.elemk.activity.bases.BaseActivityVBVM
import com.mozhimen.study_hilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVBVM<ActivityMainBinding, MainViewModel>() {
    @Inject
    lateinit var bean: Bean

    override fun initView(savedInstanceState: Bundle?) {
        vb.txt.text = bean.name
    }

    override fun bindViewVM(vb: ActivityMainBinding) {

    }
}