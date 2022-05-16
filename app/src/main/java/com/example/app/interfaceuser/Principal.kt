package com.example.app.interfaceuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityPrincipalBinding

class Principal : AppCompatActivity() {
    private lateinit var views: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(views.root)
        showName(intent)
    }

    private fun showName(intent: Intent) {
        val username = intent.getStringExtra("name_user")
        views.user.setText("Hola " + username)
    }
}