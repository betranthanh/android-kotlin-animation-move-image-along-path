package com.bett.androidkotlinanimationimagealongpath

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animationView = findViewById<AnimationView>(R.id.animationView)

        val avatars = hashSetOf(
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar1.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar2.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar3.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar4.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar5.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar6.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar7.png",
                "https://raw.githubusercontent.com/betranthanh/android-kotlin-animation-move-image-along-path/master/avatar_demo/avatar8.png"
        )

        var players = ArrayList<PlayerDto>()
        for (i in 0..7) {
            var playerDto = PlayerDto()
            playerDto.image = avatars.elementAt(i)
            playerDto.distance = Constants.PLAYER_DISTANT * i + Constants.PLAYER_SIZE
            playerDto.offsetX = Constants.PLAYER_SIZE / 2
            playerDto.offsetY = Constants.PLAYER_SIZE / 2
            players.add(playerDto)
        }
        animationView.setPlayers(players)

    }
}
