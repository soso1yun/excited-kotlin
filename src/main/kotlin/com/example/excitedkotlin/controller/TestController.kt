package com.example.excitedkotlin.controller

import com.example.excitedkotlin.service.TestService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class TestController(val testService : TestService){

    @GetMapping("/")
    fun getNameController(){
        testService.userNameService("이름")
    }





}
