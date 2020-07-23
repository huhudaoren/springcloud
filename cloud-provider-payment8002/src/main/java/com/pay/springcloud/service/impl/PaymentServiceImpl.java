package com.pay.springcloud.service.impl;

import com.common.springcloud.entities.Payment;
import com.pay.springcloud.dao.PaymentDao;
import com.pay.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment selectOne(Long id) {
        return paymentDao.selectOne(id);
    }

    @Override
    public Integer insert(Payment payment) {
        return paymentDao.insert(payment);
    }
}
