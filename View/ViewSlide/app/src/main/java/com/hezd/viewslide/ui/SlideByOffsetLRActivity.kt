package com.hezd.viewslide.ui

import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.HORIZONTAL_OFFSET

/**
 *
 *@author hezd
 *Create on 2021/11/19
 */
class SlideByOffsetLRActivity:BaseSlideActivity() {
    override fun slide() {
        slideView.offsetLeftAndRight(HORIZONTAL_OFFSET)
    }
}