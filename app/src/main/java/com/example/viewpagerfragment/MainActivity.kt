package com.example.viewpagerfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.apply{
         add(Vegetables())
         add(Fruits())
         add(Sports())
        }
        vpItem.adapter = viewPagerAdapter
        vpItem.setPageTransformer(true,DepthPageTransformer())
    }
}
