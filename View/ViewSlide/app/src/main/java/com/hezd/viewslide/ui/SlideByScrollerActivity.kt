package com.hezd.viewslide.ui

import com.hezd.viewslide.BaseSlideActivity
import com.hezd.viewslide.utils.HORIZONTAL_OFFSET
import com.hezd.viewslide.utils.VERTICAL_OFFSET

/**
 *
 *@author hezd
 *Create on 2021/11/19 16:49
 */
class SlideByScrollerActivity :BaseSlideActivity() {
    override fun slide() {
//        slideView.startSmooth(HORIZONTAL_OFFSET, VERTICAL_OFFSET)
        slideView.startSmooth(-(HORIZONTAL_OFFSET-slideView.left), -(VERTICAL_OFFSET-slideView.top))
//        slideView.setOnClickListener {
//            Toast.makeText(SlideByScrollerActivity@this,"click",Toast.LENGTH_LONG).show()
//        }

//        binding.textview.scrollTo(-50, -50)
    }
}