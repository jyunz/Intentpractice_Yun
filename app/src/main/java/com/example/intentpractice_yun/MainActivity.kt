package com.example.intentpractice_yun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ForResult를 써야 하는 상황인지 확실히 볼것.
        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
//
//            startActivityForResult(myIntent,1005)라고 하면 숫자 때문에 이해가 어려울 수 있음.
//            그래서 멤버 변수를 설정해줌 (ex.val REQUEST_FOR_NICKNAME = 1005)

            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)
        }

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        돌아온 이유가 닉네임을 받으러 다녀온게 맞는지?

        if (requestCode == REQUEST_FOR_NICKNAME) {

//            추가질문 : 확인을 눌러서 돌아온게 맞는가?
            if (resultCode == RESULT_OK) {

//                실제첨부된 새 닉네임을 꺼내서 텍스트 뷰에 반영.
                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }
    }
}