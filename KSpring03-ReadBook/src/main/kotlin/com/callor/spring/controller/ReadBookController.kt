package com.callor.spring.controller

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook
import com.callor.spring.service.BookService
import com.callor.spring.service.ReadBookService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(value = ["/read"])
class ReadBookController(val bService: BookService, val rbService : ReadBookService) {

    @RequestMapping(value=["/insert"], method = [RequestMethod.GET])
    fun home(model: Model) :String {
        model["BOOK"] = Book()
        model["RBOOK"] = ReadBook()
        return "write"
    }

    @RequestMapping(value = ["/insert"], method = [RequestMethod.POST])
    fun home(model: Model, book:Book, readBook:ReadBook) : String {




        bService.insert(book)
        rbService.insert(readBook)
        return "redirect:"

    }




}