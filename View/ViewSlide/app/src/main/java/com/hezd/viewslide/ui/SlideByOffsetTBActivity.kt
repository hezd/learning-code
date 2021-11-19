package com.hezd.viewslide.ui

import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.VERTICAL_OFFSET

/**
 *
 *@author hezd
 *Create on 2021/11/19
 */
class SlideByOffsetTBActivity :BaseSlideActivity() {
    override fun slide() {
        slideView.offsetTopAndBottom(-VERTICAL_OFFSET)
    }
}