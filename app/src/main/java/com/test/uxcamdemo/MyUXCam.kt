package com.test.uxcamdemo

import android.content.Context
import com.uxcam.UXCam

fun Context.initUXCam(){
    UXCam.startWithKey(getString(R.string.ux_cam_api_key))
}