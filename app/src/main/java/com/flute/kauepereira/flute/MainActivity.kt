package com.flute.kauepereira.flute

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.AdapterView
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var mp: MediaPlayer
    private var stat: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mp = MediaPlayer.create(this, R.raw.avemaria)

        val gridview: GridView = findViewById(R.id.gridview)
        gridview.adapter = ImageAdapter(this)

        val mFab = findViewById<FloatingActionButton>(R.id.fab)
        mFab.setOnClickListener {
            mp.stop()
        }

        gridview.onItemClickListener =
                AdapterView.OnItemClickListener { parent, v, position, id ->

                    val song = when (position) {
                        0 -> R.raw.avemaria
                        1 -> R.raw.cena
                        2 -> R.raw.darude
                        3 -> R.raw.fox
                        4 -> R.raw.hobbit
                        5 -> R.raw.hp
                        6 -> R.raw.illuminati
                        7 -> R.raw.indiana
                        8 -> R.raw.jurassic
                        9 -> R.raw.mcdonald
                        10 -> R.raw.mission
                        11 -> R.raw.naruto
                        12 -> R.raw.spongebob
                        13 -> R.raw.starwars
                        14 -> R.raw.titanic
                        else -> R.raw.avemaria
                    }
                    mp.stop()
                    mp = MediaPlayer.create(this, song)
                    mp.start()
                }
    }
}