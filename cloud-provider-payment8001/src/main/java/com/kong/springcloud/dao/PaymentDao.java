package com.kong.springcloud.dao;

import com.kong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface PaymentDao {

    public int creat(Payment payment);

    public Payment getPaymetById(Long id);
}
