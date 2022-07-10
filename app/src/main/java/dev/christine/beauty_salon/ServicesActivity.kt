package dev.christine.beauty_salon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ServicesActivity : AppCompatActivity() {
    lateinit var imgba:ImageView
    lateinit var btnHairCare:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)
     imgba= findViewById(R.id.imgba)
        imgba.setOnClickListener {
            val intent = Intent(this,Page1Activity::class.java)
            startActivity(intent)
        }
       btnHairCare = findViewById(R.id.btnHairCare)
        btnHairCare.setOnClickListener {
            val intent = Intent(this,HairCareActivity::class.java)
            startActivity(intent)
        }

    }
}