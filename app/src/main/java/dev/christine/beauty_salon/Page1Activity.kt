package dev.christine.beauty_salon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Page1Activity : AppCompatActivity() {
    lateinit var btnServices:Button
    lateinit var imgServices:ImageView
    lateinit var btnProduct:Button
    lateinit var imgProduct:ImageView
    lateinit var btnSpecialist:Button
    lateinit var ImgSpecialist:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
     btnServices = findViewById(R.id.btnServices)
        btnServices.setOnClickListener {
            val intent = Intent(this,ServicesActivity::class.java)
            startActivity(intent)
        }
    }
}