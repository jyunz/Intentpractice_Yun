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

//            들고갈 데이터를 messageIntent에 첨부
//            수화물 첨부 "message"라는 이름으로 도착지에서 찾을 수 있음./그 내용이 val inputmessage로 저장되어서
//            message라는 이름표에 inputmessage라는 캐리어를 찾는것.
//            messageIntent.putExtra("데이터 이름표", 실제 보내줄 변수 or 값)
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