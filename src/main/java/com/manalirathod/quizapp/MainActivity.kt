package com.manalirathod.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var btn_start :Button
    lateinit var et_name : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN


        btn_start.setOnClickListener{
            if(et_name.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please, Enter Your Name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}