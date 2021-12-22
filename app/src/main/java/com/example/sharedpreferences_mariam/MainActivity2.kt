package com.example.sharedpreferences_mariam

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.prefs.AbstractPreferences



class MainActivity2 : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        preferences = getSharedPreferences("Mariam", Context.MODE_PRIVATE)

        val name = preferences.getString("Name", "")
        tvName.text = name
        val Email = preferences.getString("Email", "")
        tvEmail.text = name
        val Age = preferences.getInt("Age", 0)
        tvAge.text = ""+Age

        btIntent.setOnClickListener {
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.clear()
            editor.clear()

        }
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}
