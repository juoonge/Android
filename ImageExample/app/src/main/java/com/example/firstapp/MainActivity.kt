package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener{
            iv_profile.setImageResource(R.drawable.robot) //res 경로는 R로 적는다.
            Toast.makeText(this@MainActivity,"버튼이 클릭 되었습니다.",Toast.LENGTH_SHORT).show();
        }
    }
}