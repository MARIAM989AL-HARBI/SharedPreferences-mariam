package com.example.sharedpreferences_mariam

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //It's just a training Shared Preeferences, not an assessment..Thank you
    //I did not understand what is required in the assignment.
    lateinit var sharedPreferences: SharedPreferences
    var isRemembered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences = getSharedPreferences("Mariam", Context.MODE_PRIVATE)

        if (isRemembered) {
            val intent = Intent(this, MainActivity2::class.java)
            isRemembered = sharedPreferences.getBoolean("CheckBox",false)
            startActivity(intent)
            finish()

        }
        btIntent.setOnClickListener {

                val name: String = Name.text.toString()
                val Age: Int = Age.text.toString().toInt()
                val Email: String = Email.text.toString()
             val checkBox: Boolean = checkBox.isChecked

             val editor : SharedPreferences.Editor = sharedPreferences.edit()
             editor.putString("Name",name)
            editor.putString("Email",Email)

            editor.putInt("Age", Age)
editor.putBoolean("CheckBox",checkBox)
             editor.apply()

            Toast.makeText(this,"Woow Information Saved!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()


            }
        }
    }



