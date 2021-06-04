package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_join.*
import kotlinx.android.synthetic.main.activity_join.idEdt

class JoinActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        okBtn.setOnClickListener() {
            if(idEdt.length() == 0) {
                Toast.makeText(this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show()
            }else if(nameEdt.length() == 0) {
                Toast.makeText(this, "이름 입력", Toast.LENGTH_SHORT).show()
            }else if(passEdt2.length() == 0) {
                Toast.makeText(this, "비번 입력", Toast.LENGTH_SHORT).show()
            }else if(passChkEdt.length() == 0) {
                Toast.makeText(this, "비번체크 입력", Toast.LENGTH_SHORT).show()
            }else if(!passEdt2.text.toString().equals(passChkEdt.text.toString())) {
                Toast.makeText(this, "비밀번호가 같지않습니다", Toast.LENGTH_SHORT).show()
            }else {
                intent.putExtra("id2", idEdt.text.toString())
                intent.putExtra("pw", passEdt2.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}