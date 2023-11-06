package com.example.sportsapp2

import android.content.Intent
import android.media.tv.TvContract.Channels.Logo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.ViewParent
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {


    lateinit var tvResult: Button
    lateinit var tvLive: Button
    lateinit var tvNews: Button
    lateinit var tvTeams: Button
    lateinit var tvTournaments: Button
    lateinit var Logo: ImageView
    lateinit var Settings: ImageView
    lateinit var searchBar: ImageView
    lateinit var llParent: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Sports App")

        tvResult = findViewById(R.id.tvResults)
        tvLive = findViewById(R.id.tvLive)
        tvNews = findViewById(R.id.tvNews)
        tvTeams = findViewById(R.id.tvTeams)
        tvTournaments = findViewById(R.id.tvTournaments)
        Logo = findViewById(R.id.logo)
        Settings = findViewById(R.id.settings)
        searchBar = findViewById(R.id.search_bar)
        llParent = findViewById(R.id.llParent)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        tvResult.setOnClickListener {
            redirectToResultScreen()
        }
        tvLive.setOnClickListener {
            redirectToLiveScreen()
        }
        tvNews.setOnClickListener {
            redirectToNewsScreen()
        }
        tvTeams.setOnClickListener {
            redirectToTeamsScreen()
        }
        tvTournaments.setOnClickListener {
            redirectToTournamentsScreen()
        }
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
        val intent = Intent(this@MainActivity, MainActivity::class.java)
        startActivity(intent)
    }

    private fun redirectToSearch() {
        val intent = Intent(this@MainActivity, SettingsScreen::class.java)
        startActivity(intent)
    }

    private fun redirectToSettings() {
        val intent = Intent(this@MainActivity, SearchBarScreen::class.java)
        startActivity(intent)
    }

    private fun redirectToTeamsScreen() {
        val intent = Intent(this@MainActivity, TeamsScreen::class.java)
        startActivity(intent)
    }

    private fun redirectToTournamentsScreen() {
        val intent = Intent(this@MainActivity, TournamentsScreen::class.java)
        startActivity(intent)
    }

    private fun redirectToResultScreen() {
        val intent = Intent(this@MainActivity, ResultScreen::class.java)
        startActivity(intent)
    }
    private fun redirectToLiveScreen() {
        val intent = Intent(this@MainActivity, LiveScreen::class.java)
        startActivity(intent)
    }
    private fun redirectToNewsScreen() {
        val intent = Intent(this@MainActivity, NewsScreen::class.java)
        startActivity(intent)
    }
}