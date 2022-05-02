package com.minimaltools.multiintentapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.minimaltools.multiintentapp.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menu: BottomNavigationView = findViewById(R.id.bottom_navigation)
        setupWithNavController(menu, findNavController(this, R.id.fragment_menu))
    }
}