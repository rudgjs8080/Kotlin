package com.callor.spring.controller

import com.callor.spring.ConfigString
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {
    
    @RequestMapping(value=["/"], method = [RequestMethod.GET])
    fun home(model:Model) : String{
        println(ConfigString.APP_NAME)
        println(ConfigString.APP_VERSION)

        var userList = bService.selectAll()
        return "home"
    }
    
    @ResponseBody
    @RequestMapping(value=["/home"], method = [RequestMethod.GET])
    fun home2() : String {
        return "텍스트"
    }
}