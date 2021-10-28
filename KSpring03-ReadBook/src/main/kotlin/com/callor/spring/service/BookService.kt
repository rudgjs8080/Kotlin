package com.callor.spring.service

import com.callor.spring.model.Book

interface BookService {

    fun insert(book:Book):Book
}