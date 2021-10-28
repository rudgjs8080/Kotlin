package com.callor.spring.service.impl

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook
import com.callor.spring.repository.BookRepository
import com.callor.spring.service.BookService
import org.springframework.stereotype.Service

@Service("bServiceV1")
class bookServiceImplv1(val bRepo:BookRepository): BookService {
    override fun insert(book: Book): Book {
        return bRepo.save(book)
    }


}