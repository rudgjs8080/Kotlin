package com.callor.spring.repository

import com.callor.spring.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository:JpaRepository<Book,String> {



}