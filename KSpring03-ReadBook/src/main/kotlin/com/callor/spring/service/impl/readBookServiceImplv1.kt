package com.callor.spring.service.impl

import com.callor.spring.model.ReadBook
import com.callor.spring.repository.ReadBookRepository
import com.callor.spring.service.ReadBookService
import org.springframework.stereotype.Service

@Service("rbServiceV1")
class readBookServiceImplv1(val rbRepo: ReadBookRepository): ReadBookService {

    override fun insert(readBook: ReadBook): ReadBook {
        return rbRepo.save(readBook)
    }


}