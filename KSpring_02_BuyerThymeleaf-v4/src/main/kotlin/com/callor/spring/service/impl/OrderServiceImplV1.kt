package com.callor.spring.service.impl

import com.callor.spring.models.Sales
import com.callor.spring.repository.SalesRepository
import com.callor.spring.service.OrderService
import org.springframework.stereotype.Service

@Service("orderServiceV1")
class OrderServiceImplV1(var salesDao:SalesRepository):OrderService {
    override fun selectAll(): Array<Sales> {
        return salesDao.findAll().toTypedArray()
    }

    override fun findById(seq: Long): Sales {
        return salesDao.findById(seq).get()
    }

    override fun findByUserId(userid: String): Array<Sales> {
        return salesDao.findByUserid(userid)
    }

    override fun findByPName(pname: String): Array<Sales> {
        return salesDao.findByPname(pname)
    }

    override fun findByDateDestance(sDate: String, eDate: String): Array<Sales> {
        return salesDao.findAll().toTypedArray()
    }

    override fun insert(sales: Sales): Sales {
        return salesDao.save(sales)
    }

    override fun delete(seq: Long) {
        salesDao.deleteById(seq)
    }

    override fun update(sales: Sales): Sales {
        return salesDao.save(sales)
    }

}