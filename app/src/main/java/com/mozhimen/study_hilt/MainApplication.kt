package com.mozhimen.study_hilt

import com.mozhimen.basick.elemk.android.app.bases.BaseApplication
import com.mozhimen.basick.lintk.optin.OptInApiMultiDex_InApplication
import dagger.hilt.android.HiltAndroidApp

@OptIn(OptInApiMultiDex_InApplication::class)
@HiltAndroidApp
class MainApplication : BaseApplication()