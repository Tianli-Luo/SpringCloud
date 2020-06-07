package com.ltl.springcloud.dao;


import com.ltl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Tianly
 */

@Mapper
public interface PaymentDao {
    int save(Payment payment);
    Payment getById(Long id);

}
