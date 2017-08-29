package com.bett.androidkotlinanimationimagealongpath

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animationView = findViewById<AnimationView>(R.id.animationView)

        var players = ArrayList<PlayerDto>()
        for (i in 0..9) {
            var playerDto: PlayerDto = PlayerDto()
            playerDto.image = "https://maxcdn.icons8.com/Share/icon/color/Gaming//pokecoin1600.png"
            playerDto.distance = Constants.PLAYER_DISTANT * i + Constants.PLAYER_SIZE
            playerDto.offsetX = Constants.PLAYER_SIZE / 2
            playerDto.offsetY = Constants.PLAYER_SIZE / 2
            players.add(playerDto)
        }
        animationView.setPlayers(players)

    }
}
