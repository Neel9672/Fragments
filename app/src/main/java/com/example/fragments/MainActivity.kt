package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener {
            val fragment1 = FragmentOne()
            loadFragment(fragment1)

        }

        button2.setOnClickListener {
            val fragment2 = FragmentTwo()
            loadFragment(fragment2)

        }

    }

    fun loadFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager

        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }


}