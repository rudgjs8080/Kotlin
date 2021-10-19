package com.callor.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {
    
    @RequestMapping(value=["/"], method = [RequestMethod.GET])
    fun home() : String{
        return "home"
    }
    
    @ResponseBody
    @RequestMapping(value=["/home"], method = [RequestMethod.GET])
    fun home2() : String {
        return "텍스트"
    }
}