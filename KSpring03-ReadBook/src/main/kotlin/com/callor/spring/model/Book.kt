package com.callor.spring.model

import javax.persistence.*

@Entity
@Table(name = "tbl_book", schema = "naraDB")
data class Book (
    @Id
    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true, name = "isbn")
    var isbn : String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    var title : String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    var comp : String? = null,

    @Column(columnDefinition = "VARCHAR(25)", nullable = false)
    var author : String? = null,

    @Column(nullable = true)
    var price : Int? = null,
)