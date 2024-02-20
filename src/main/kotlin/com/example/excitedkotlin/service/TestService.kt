package com.example.excitedkotlin.service

import org.springframework.stereotype.Service
import java.lang.NullPointerException

@Service
class TestService{

    fun userNameService(name: String?){
        if (name == null){
            throw NullPointerException("이름을 추가해주세여")
        }
        else {
            println("name")
        }
    }

}

