package com.callor.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class HomeController {
    @ResponseBody
    @RequestMapping(value=["/"], method = [RequestMethod.GET])
    fun home() : String{
        return "잠온다"
    }
    @RequestMapping(value=["/hello"], method = [RequestMethod.GET])
    fun hello() : String {

        return "hello"
    }

}