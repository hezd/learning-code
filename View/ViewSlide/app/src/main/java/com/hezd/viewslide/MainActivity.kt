package com.hezd.viewslide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hezd.viewslide.databinding.ActivityMainBinding
import com.hezd.viewslide.ui.*

/**
 * @author hezd
 * Create on 2021-11-19 15:51
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLayout.setOnClickListener(this)
        binding.btnOffsetLeftAndRight.setOnClickListener(this)
        binding.btnOffsetTopAndBottom.setOnClickListener(this)
        binding.btnOffsetLayoutParams.setOnClickListener(this)
        binding.btnOffsetAnimation.setOnClickListener(this)
        binding.btnOffsetScroller.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_layout->{
                startActivity(Intent(this,SlideByLayoutActivity::class.java))
            }
            R.id.btn_offset_left_and_right->{
                startActivity(Intent(this,SlideByOffsetLRActivity::class.java))
            }
            R.id.btn_offset_top_and_bottom->{
                startActivity(Intent(this,SlideByOffsetTBActivity::class.java))
            }
            R.id.btn_offset_layout_params->{
                startActivity(Intent(this,SlideByLayoutParamsActivity::class.java))
            }
            R.id.btn_offset_animation->{
                startActivity(Intent(this,SlideByAnimationActivity::class.java))
            }
            R.id.btn_offset_scroller->{
                startActivity(Intent(this,SlideByScrollerActivity::class.java))
            }
        }
    }
}