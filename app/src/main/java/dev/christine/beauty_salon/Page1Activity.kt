package dev.christine.beauty_salon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Page1Activity : AppCompatActivity() {
    lateinit var tilServices:TextInputLayout
    lateinit var etServices:TextInputEditText
    lateinit var tilProduct:TextInputLayout
    lateinit var etProduct:TextInputEditText
    lateinit var tilSpecialist:TextInputLayout
    lateinit var etSpecialist:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        etServices = findViewById(R.id.etServices)
        etServices.setOnClickListener {
            val intent = Intent(this,ServicesActivity::class.java)
            startActivity(intent)
        }
    }
}