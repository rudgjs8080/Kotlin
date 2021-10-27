package com.callor.spring.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tb_readbook", schema = "naraDB")
data class ReadBook (
    @Id
    @Column(columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var seq : Int? = null,
    var isbn : String? = null,
    var rdate : String? = null,
    var stime : String? = null,
    var etime : String? = null,
    var rating : Int? = null,
    var comment : String? = null,

    // 데이터에 특별하게 Date(날짜, 시간형) 값을 사용하고 싶을때
    @Transient // table 생성할때 칼럼에 추가하지 말라!!
    @Temporal(TemporalType.DATE)
    var date1 : Date? = null,

    @Transient
    @Temporal(TemporalType.TIME)
    var start_time : Date? = null,

    @Transient
    @Temporal(TemporalType.TIMESTAMP)
    var end_time : Date? = null,

)