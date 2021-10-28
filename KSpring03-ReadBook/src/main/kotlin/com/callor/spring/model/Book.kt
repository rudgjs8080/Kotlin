package com.callor.spring.model

import javax.persistence.*

@Entity
@Table(name = "tbl_book", schema = "naraDB")
data class Book (
    @Id
    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true, name = "isbn")
    var isbn : String? = null,

    var title : String? = null,

    var comp : String? = null,

    var author : String? = null,

    var price : Int? = null,
)