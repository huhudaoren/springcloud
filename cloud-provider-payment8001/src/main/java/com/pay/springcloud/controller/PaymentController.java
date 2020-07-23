package com.pay.springcloud.controller;


import com.common.springcloud.entities.CommonResult;
import com.common.springcloud.entities.Payment;
import com.pay.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;


    @GetMapping(value = "getOne/{id}")
    public CommonResult<Payment> getOne(@PathVariable("id")Long id){
        Payment payment = paymentService.selectOne(id);
        log.info("***** getOne:{}",payment);
        if(payment == null){
            return new CommonResult(202,"获取NULL",null);
        }else {
            return new CommonResult(200,"获取成功",payment);
        }
    }


    @PostMapping(value = "save")
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        log.info("***** save:{}",result);
        if(result > 0){
            return new CommonResult(200,"添加成功",result);
        }else {
            return new CommonResult(202,"添加失败",null);
        }
    }
}
