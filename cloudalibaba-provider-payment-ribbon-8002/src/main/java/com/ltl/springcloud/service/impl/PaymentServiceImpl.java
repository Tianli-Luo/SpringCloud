package com.ltl.springcloud.service.impl;

import com.ltl.springcloud.dao.PaymentDao;
import com.ltl.springcloud.entities.Payment;
import com.ltl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ltl
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2020/6/5 17:32
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.getById(id);
    }
}
