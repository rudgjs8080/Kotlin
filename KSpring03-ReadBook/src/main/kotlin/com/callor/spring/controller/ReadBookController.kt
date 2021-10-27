package com.callor.spring.controller

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(value = ["/read"])
class ReadBookController {

    @RequestMapping(value=["/insert"], method = [RequestMethod.GET])
    fun home(model: Model) :String {
        model["BOOK"] = Book()
        model["RBOOK"] = ReadBook()
        return "write"
    }



}