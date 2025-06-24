package com.example.netflixlogin

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var birdPicture: ImageView
    private lateinit var puppyPicture: ImageView
    private lateinit var fishPicture: ImageView
    private lateinit var kittyPicture: ImageView
    private lateinit var kidsPicture: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        configureViews()
        configureImage()
    }

    private fun configureViews() {
        birdPicture = findViewById(R.id.birdImg)
        puppyPicture = findViewById(R.id.puppyImg)
        fishPicture = findViewById(R.id.fishImg)
        kittyPicture = findViewById(R.id.kittyImg)
        kidsPicture = findViewById(R.id.kidsImg)
    }

    private fun configureImage() {
        birdPicture.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.bird))
        puppyPicture.setImageDrawable(AppCompatResources.getDrawable(this,R.drawable.puppy))
        fishPicture.setImageDrawable(AppCompatResources.getDrawable(this,R.drawable.goldfish))
        kittyPicture.setImageDrawable(AppCompatResources.getDrawable(this,R.drawable.kitty))
        kidsPicture.setImageDrawable(AppCompatResources.getDrawable(this,R.drawable.babyanimals))
    }

}