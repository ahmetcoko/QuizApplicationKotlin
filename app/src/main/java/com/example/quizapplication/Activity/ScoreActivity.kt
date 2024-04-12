package com.example.quizapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapplication.R
import com.example.quizapplication.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    var score : Int =0
    lateinit var bindind : ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind  = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(bindind.root)

        score = intent.getIntExtra("score", 0)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
        )

        bindind.apply {
            scoreTxt.text=score.toString()
            backBtn2.setOnClickListener {
                startActivity(Intent(this@ScoreActivity,MainActivity::class.java))

                finish()
            }
        }

    }
}