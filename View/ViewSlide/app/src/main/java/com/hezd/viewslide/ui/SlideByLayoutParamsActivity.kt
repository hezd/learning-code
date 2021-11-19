package com.hezd.viewslide.ui

import androidx.constraintlayout.widget.ConstraintLayout
import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.HORIZONTAL_OFFSET
import com.hezd.viewslide.utils.VERTICAL_OFFSET

/**
 *
 *@author hezd
 *Create on 2021/11/19 15:53
 */
class SlideByLayoutParamsActivity :BaseSlideActivity() {
    override fun slide() {
        val layoutParams = slideView.layoutParams as ConstraintLayout.LayoutParams
        layoutParams.leftMargin = HORIZONTAL_OFFSET
        layoutParams.topMargin = VERTICAL_OFFSET
        slideView.layoutParams = layoutParams
    }
}