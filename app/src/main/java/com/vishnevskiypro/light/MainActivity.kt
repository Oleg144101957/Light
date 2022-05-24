package com.vishnevskiypro.light

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var flashClass: Flash
    lateinit var flashLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btnFlash)
        flashClass = Flash(context = this)
        flashLayout = findViewById<ConstraintLayout>(R.id.flashLayout)

        btn.setOnClickListener {
            if (flashClass.isFlashStatus() == false){
                flashClass.flashOn()
                btn.text = "Flash off"
                flashLayout.setBackgroundColor(Color.BLACK)

            } else {
                flashClass.flashOff()
                btn.text = "Flash on"
                flashLayout.setBackgroundColor(Color.WHITE)
            }
        }
    }

}