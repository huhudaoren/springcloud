package com.pay.springcloud.dao;


import com.common.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    Payment selectOne(@Param(value = "id")Long id);

    Integer insert(Payment payment);

}
