package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app.databinding.ActivityMainBinding
import com.example.app.interfaceuser.Principal

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListener()
    }

    private fun initializacionListener() {
        //views.buttonLoggin.setOnClickListener{
        //var palabras = views.editTextTextPersonName.text ; views.editTextTextPassword.text
        //Toast.makeText(this,resources.getString(R.string.user)+" : " + views.editTextTextPersonName.text + "\n"
        //+ resources.getString(R.string.password)+ " : " + views.editTextTextPassword.text, Toast.LENGTH_SHORT).show()
        views.button2.setOnClickListener {
            val user = views.editTextTextPersonName.text.toString()
            val password = views.editTextTextPassword2.text.toString()
            user?.let {
                password?.let { itp ->
                    if (it == "admin" && itp == "admin") {
                        Principal(user)
                    }
                    else
                        //INCORRECTO//
                        Toast.makeText(applicationContext,"Usuario o Contraseña no son correctos",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun Principal(user: String) {
        var intent = Intent(this, Principal::class.java)
        intent.putExtra("name_user", user)
        startActivity(intent)
    }

}
