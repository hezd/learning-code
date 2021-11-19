package com.hezd.viewslide.utils

import android.content.res.Resources

/**
 *
 *@author hezd
 *Create on 2021/11/17
 */
val Float.dp:Int get() = (Resources.getSystem().displayMetrics.density*this+0.5f).toInt()