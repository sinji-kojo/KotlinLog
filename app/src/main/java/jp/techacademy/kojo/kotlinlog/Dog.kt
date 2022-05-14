package jp.techacademy.kojo.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int,hobby: String): super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}