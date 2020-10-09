package com.kong.springcloud.service;

import com.kong.springcloud.entities.Payment;

public interface PaymentService {

    public int creat(Payment payment);

    public Payment getPaymetById(Long id);
}
