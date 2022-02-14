package com.example.intentpractice_yun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//             입력한 새 닉네임이 뭔지 val input = 상황마다 다르게 입력값 받아오기
            val inputNewNickname = newNicknameEdt.text.toString()
//
//            입력한 닉네임을 가지고 메인으로 복귀
//            확인 버튼과 백버튼을 구별해야 함
//            들고 돌아갈 데이터 세팅


//            입력 닉네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
                resultIntent.putExtra("nickname",inputNewNickname)
                setResult(RESULT_OK,resultIntent)
                finish()

        }
    }
}