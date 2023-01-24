package com.example.quizapp_ii


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp_ii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {

            if(binding.etName.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, QuizQuestionActivity::class.java)
               intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}