package com.hezd.viewslide

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.hezd.viewslide.databinding.ActivityBaseSlideBinding
import com.hezd.viewslide.widget.SlideView

/**
 * @author Create on hezd 2021-11-19 15:45
 */
abstract class BaseSlideActivity : AppCompatActivity() {
    protected lateinit var binding: ActivityBaseSlideBinding
    protected lateinit var slideView: SlideView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseSlideBinding.inflate(layoutInflater)
        setContentView(binding.root)
        slideView = binding.slideView
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        slideView.postDelayed({
            slide()
        }, 1000)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    abstract fun slide()
}