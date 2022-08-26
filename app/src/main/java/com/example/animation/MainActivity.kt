package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ShapeableImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    private fun initViews() {
        imageView = findViewById(R.id.imageView)
        val btnBlink: Button = findViewById(R.id.btnBlink)
        val blinkAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.move)

        val btnBounce: Button = findViewById(R.id.btnBounce)
        val bounce: Animation = AnimationUtils.loadAnimation(this,R.anim.bounce)

        val btnFadeIn: Button = findViewById(R.id.fadeIn)
        val fadeIn: Animation = AnimationUtils.loadAnimation(this,R.anim.fade_in)

        val btnFadeOut: Button = findViewById(R.id.btnFadeOut)
        val fadeOut: Animation = AnimationUtils.loadAnimation(this,R.anim.fade_out)

        val btnMove: Button = findViewById(R.id.btnMove)
        val move: Animation = AnimationUtils.loadAnimation(this,R.anim.move)

        val btnRotate: Button = findViewById(R.id.btnRotate)
        val rotate: Animation = AnimationUtils.loadAnimation(this,R.anim.rotate)

        val btnSequentual: Button = findViewById(R.id.btnSequentual)
        val sequantual: Animation = AnimationUtils.loadAnimation(this,R.anim.sequentual)

        val btnSlideDown: Button = findViewById(R.id.btnSlideDown)
        val slideDown: Animation = AnimationUtils.loadAnimation(this,R.anim.slide_down)

        val btnSlideUp: Button = findViewById(R.id.btnSlideUp)
        val slideUp: Animation = AnimationUtils.loadAnimation(this,R.anim.slide_up)

        val btnTogether: Button = findViewById(R.id.btnTogether)
        val together: Animation = AnimationUtils.loadAnimation(this,R.anim.together)

        val btnZoomIn: Button = findViewById(R.id.btnZoomIn)
        val zoomIn: Animation = AnimationUtils.loadAnimation(this,R.anim.zoom_in)

        val btnZoomOut: Button = findViewById(R.id.btnZoomOut)
        val zoomOut: Animation = AnimationUtils.loadAnimation(this,R.anim.zoom_out)

        btnBlink.setOnClickListener {
            imageView.startAnimation(blinkAnim)
        }
        btnBounce.setOnClickListener {
            imageView.startAnimation(bounce)
        }
        btnFadeIn.setOnClickListener {
            imageView.startAnimation(fadeIn)
        }
        btnFadeOut.setOnClickListener {
            imageView.startAnimation(fadeOut)
        }
        btnMove.setOnClickListener {
            imageView.startAnimation(move)
        }
        btnRotate.setOnClickListener {
            imageView.startAnimation(rotate)
        }
        btnSequentual.setOnClickListener {
            imageView.startAnimation(sequantual)
        }
        btnSlideUp.setOnClickListener {
            imageView.startAnimation(slideUp)
        }
        btnSlideDown.setOnClickListener {
            imageView.startAnimation(slideDown)
        }
        btnTogether.setOnClickListener {
            imageView.startAnimation(together)
        }
        btnZoomIn.setOnClickListener {
            imageView.startAnimation(zoomIn)
        }
        btnZoomOut.setOnClickListener {
            imageView.startAnimation(zoomOut)
        }

    }


}