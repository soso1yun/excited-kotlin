package com.example.excitedkotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

const val GLOBAL_VAL = "이건테스트"

@SpringBootTest
class ExcitedKotlinApplicationTests {

    @Test
    fun contextLoads() {
        Tests("a")
    }

    @Test
    fun 반복문연습(){

        for(i in 10 downTo 1){
            println("$i")
        }

        for(i: Int in 1..10){
            println("$i")
        }

    }


}
