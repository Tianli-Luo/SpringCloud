package com.ltl.springcloud.service;


import com.ltl.springcloud.entities.Payment;

/**
 * @author Tianly
 */
public interface PaymentService {
    int save(Payment payment);
    Payment getById(Long id);
}
