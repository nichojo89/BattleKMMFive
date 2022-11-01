package com.nicholssoftware.battlekmm.android.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.nicholssoftware.battlekmm.android.R

const val PLAYER_WINS = "PLAYER_WINS"
const val LEVEL = "LEVEL"

class PlayAgain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_again)

        val playerWIns = intent.getBooleanExtra(PLAYER_WINS, false)

        var goBackIntent = Intent()
        var level = 1
        val tv_outcome = findViewById<TextView>(R.id.tv_outcome)
        val btn_play_again = findViewById<Button>(R.id.btn_play_again)
        if(playerWIns){
            //Stretch goal #3: Progress through the game world by defeating different obstacles (such as defeating enemies, and progressing to the next area)
            tv_outcome.text = "You Win!"
            level = intent.getIntExtra(LEVEL,1)
            level++
            btn_play_again.text = "Level $level"

        } else {
            tv_outcome.text = "You Lose"
            btn_play_again.text = "Restart"
        }

        goBackIntent.putExtra(LEVEL, level)
        btn_play_again.setOnClickListener {
            setResult(RESULT_OK, goBackIntent)
            finish()
        }
    }
}