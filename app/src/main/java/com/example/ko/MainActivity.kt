package com.example.ko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnClickListener(object : View.OnClickListener)

        // 1. Kotlin interface가 아닌 자바 인터페이스여야 한다.
        // 2. 그 인터페이스는 하나의 메소드만 가져야 한다.
    }
}