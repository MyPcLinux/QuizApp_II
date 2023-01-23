package com.example.quizapp_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp_ii.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}