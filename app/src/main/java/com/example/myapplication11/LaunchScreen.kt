package com.example.myapplication11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import android.widget.ImageView

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)
        val image: ImageView =findViewById(R.id.imageView)
        val animation= AnimationUtils.loadAnimation(this,R.anim.myrotate)
        image.startAnimation(animation)
        val timer = object : CountDownTimer(2500, 2000){

            override fun onTick(millisUntiFinished: Long) {


            }

            override fun onFinish() {
                val intent = Intent(this@LaunchScreen, MainActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
        timer.start()
    }


}