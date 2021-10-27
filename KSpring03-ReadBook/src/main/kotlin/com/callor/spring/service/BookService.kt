package com.callor.spring.service

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook

interface BookService {

    fun insert(book:Book):Book
}