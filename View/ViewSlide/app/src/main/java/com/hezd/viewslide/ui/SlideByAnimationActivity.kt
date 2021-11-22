package com.hezd.viewslide.ui

import android.view.animation.TranslateAnimation
import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.HORIZONTAL_OFFSET
import com.hezd.viewslide.utils.VERTICAL_OFFSET

/**
 *
 *@author hezd
 *Create on 2021/11/19 16:16
 */
class SlideByAnimationActivity : BaseSlideActivity() {
    override fun slide() {
        val translateAnimation = TranslateAnimation(
            0f,
            (HORIZONTAL_OFFSET - slideView.left).toFloat(),
            0f,
            (VERTICAL_OFFSET - slideView.top).toFloat()
        )
        translateAnimation.duration = 500
        translateAnimation.fillAfter = true
        slideView.startAnimation(translateAnimation)
    }
}