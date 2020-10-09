package com.kong.springcloud.controller;

import com.kong.springcloud.entities.CommonResult;
import com.kong.springcloud.entities.Payment;
import com.kong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/payment/creat")
    public CommonResult creat(@RequestBody Payment payment){

        int result = paymentService.creat(payment);
        log.info("result*********" + result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymetById(id);

        if (payment != null){
            return new CommonResult(200,"读取数据库成功",payment);
        }else {
            return new CommonResult(444,"读取失败",null);
        }
    }


}
