package jp.techacademy.kojo.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animal = Animal("ポチ", 3,"仕事")
        animal.say()

        val animal2 = Animal("ポチ", 3,"仕事")
        animal2.think()
    }
}