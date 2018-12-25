package com.fec.core.customview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.customview.widget.RatingBar


class MainActivity : AppCompatActivity() {
    private var mRatingBar: RatingBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRatingBar = findViewById<View>(R.id.ratingbar) as RatingBar
        mRatingBar?.setStar(3.0F)
        //1111111111111
    }
}
