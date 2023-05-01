package com.example.nurafshonpm.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.nurafshonpm.Activities.activities.activity.HomePage.HomePage
import com.example.nurafshonpm.R
import kotlin.math.sign

//Edit by Paxriddinov
class SignInActivity : AppCompatActivity() {
    private lateinit var signInButton: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initViews()
    }

    private fun initViews() {
        signInButton = findViewById(R.id.signInButton_id)
        signInButton.setOnClickListener {
            val intent = Intent(this@SignInActivity, HomePage::class.java)
            startActivity(intent)
        }
    }
}