package com.callor.spring.repository

import com.callor.spring.model.Book
import com.callor.spring.model.ReadBook
import org.springframework.data.jpa.repository.JpaRepository

interface ReadBookRepository:JpaRepository<ReadBook,String> {



}