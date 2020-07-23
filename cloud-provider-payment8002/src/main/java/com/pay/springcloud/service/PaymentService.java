package com.pay.springcloud.service;


import com.common.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {

    Payment selectOne(@Param(value = "id") Long id);

    Integer insert(Payment payment);

}
