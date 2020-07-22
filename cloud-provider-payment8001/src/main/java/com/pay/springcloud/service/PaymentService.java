package com.pay.springcloud.service;

import com.pay.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface PaymentService {

    Payment selectOne(@Param(value = "id")Long id);

    Integer insert(Payment payment);

}
