package com.callor.spring.service

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook

interface ReadBookService {

    fun insert(readBook:ReadBook):ReadBook
}