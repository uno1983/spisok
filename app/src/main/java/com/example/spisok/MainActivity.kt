package com.example.spisok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

val spisok = mutableListOf<Int>()//создаем пустую коллекцию

fun spisokCreate() { // заполняем коллекцию символами
        var i = 1
                while (i <= 10) {
            spisok.add(i)
            i++
        }
    }

fun main () {
    spisokCreate() // вызываем функцию заполненния коллекции
       println ("ваша коллекция: $spisok") //выводим результат
}