package com.example.intentpractice_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

//        이 화면에 들어올때 첨부된 데이터를 텍스트뷰에 반영
//        Val 받아줄 변수 = intent.get 자료형[string으로 보냈으면 그것으로,int로 보냈으면 그것으로]("데이터이름표")
//        받아준 변수를 활용한 상황에 맞는 코드 작성
        val intentMessage = intent.getStringExtra("message")


        recivedTxt.text = intentMessage
    }
}