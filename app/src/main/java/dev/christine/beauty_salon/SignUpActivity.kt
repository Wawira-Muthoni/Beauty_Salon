package dev.christine.beauty_salon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var tilFirstName:TextInputLayout
    lateinit var etFirstName:TextInputEditText
    lateinit var tilLastName: TextInputLayout
    lateinit var etLastName:TextInputEditText
    lateinit var tilEmail:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var etConfirmPassword:TextInputEditText
    lateinit var tilConfirmPassword:TextInputLayout
    lateinit var tvAccount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        etConfirmPassword.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
