package com.kong.springcloud.service.impl;

import com.kong.springcloud.dao.PaymentDao;
import com.kong.springcloud.entities.Payment;
import com.kong.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymetById(Long id) {
        return paymentDao.getPaymetById(id);
    }
}
