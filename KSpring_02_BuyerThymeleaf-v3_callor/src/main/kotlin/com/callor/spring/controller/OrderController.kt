package com.callor.spring.controller

import com.callor.spring.service.OrderService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping(value=["/order"])
class OrderController(var orService:OrderService) {

    @RequestMapping(value=["","/"])
    fun list(model:Model) :String {
        val salesList = orService.selectAll()
        model["SALES"] = salesList
        return "order/list"
    }

    @RequestMapping(value = ["/detail"], method = [RequestMethod.GET])
    fun detail(model: Model, @RequestParam("seq") seq: Long): String {
        val sale = orService.findById(seq)
        model["SALES"] = sale
        return "order/detail"

    }
}