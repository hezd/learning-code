package com.hezd.viewslide.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Scroller

/**
 *
 *@author hezd
 *Create on 2021/11/19 16:55
 */
class SlideView @JvmOverloads constructor(context:Context,attrs:AttributeSet?=null) : View(context,attrs){
    private var scroller: Scroller = Scroller(context)
    override fun computeScroll() {
        if(scroller.computeScrollOffset()){
            (parent as View).scrollTo(scroller.currX,scroller.currY)
            postInvalidate()
            (parent as View).postInvalidate()
        }
    }

    fun startSmooth(delX:Int,delY:Int){
        val destX = delX - scrollX
        scroller.startScroll(scrollX,0,destX,delY,2000)
        invalidate()
    }
}