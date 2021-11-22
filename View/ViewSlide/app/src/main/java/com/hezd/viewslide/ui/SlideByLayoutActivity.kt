package com.hezd.viewslide.ui

import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.HORIZONTAL_OFFSET
import com.hezd.viewslide.utils.VERTICAL_OFFSET


/**
 *
 *@author hezd
 *Create on 2021/11/18
 */
class SlideByLayoutActivity : BaseSlideActivity() {
    override fun slide() {
        slideView.layout(
            HORIZONTAL_OFFSET,
            VERTICAL_OFFSET,
            HORIZONTAL_OFFSET + slideView.width,
            VERTICAL_OFFSET + slideView.height
        )
    }
}