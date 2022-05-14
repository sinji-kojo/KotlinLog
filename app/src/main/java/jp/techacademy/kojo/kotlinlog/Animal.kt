package jp.techacademy.kojo.kotlinlog

import android.util.Log

open class Animal : Human , Thinkable{
    // 引数付きコンストラクタ
    constructor(name: String, age: Int , hobby: String): super(name, age, hobby) {
    }

    // Humanクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私は名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は、" +this.hobby + "について考える。")
    }
}