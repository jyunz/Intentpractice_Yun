package com.example.intentpractice_yun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendMessageBtn.setOnClickListener {

//            입력한 내용을 변수에 저장

            val inputmessage = messageEdt.text.toString()

//            비행기 티켓발권
            val messageIntent = Intent(this, MessageActivity::class.java )

//            수화물 첨부
            messageIntent.putExtra("message",inputmessage)

//            실제 출발
            startActivity(messageIntent)
        }

        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 이동 (OtherActivity)
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }



    }
}