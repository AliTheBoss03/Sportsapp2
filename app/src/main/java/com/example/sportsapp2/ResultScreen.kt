package com.example.sportsapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultScreen : AppCompatActivity() {
    lateinit var Logo: ImageView
    lateinit var Settings: ImageView
    lateinit var searchBar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        Logo = findViewById(R.id.logo)
        Settings = findViewById(R.id.settings)
        searchBar = findViewById(R.id.search_bar)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        Settings.setOnClickListener {
            redirectToSettings()
        }
        searchBar.setOnClickListener {
            redirectToSearch()
        }
        Logo.setOnClickListener {
            redirectToMainScreen()
        }
    }

    private fun redirectToMainScreen() {
        val intent = Intent(this@ResultScreen, MainActivity::class.java)
        startActivity(intent)
    }

    private fun redirectToSearch() {
        val intent = Intent(this@ResultScreen, SettingsScreen::class.java)
        startActivity(intent)
    }

    private fun redirectToSettings() {
        val intent = Intent(this@ResultScreen, SearchBarScreen::class.java)
        startActivity(intent)
    }
}