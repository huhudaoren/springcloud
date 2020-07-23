package com.order.springcloud.controller;


import com.common.springcloud.entities.CommonResult;
import com.common.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RequestMapping(value = "order")
@RestController
@Slf4j
public class OrderController {

//    @Value("rest.url.paymentURL")
//    private  static  String PAYMENT_URL;
      private final static  String PAYMENT_URL = "http://localhost:8001";

    /**
     * RestTemplate 提供了多种便捷访问Http服务的方法
     * 是一种便捷的访问restful服务模块
     * 是Spring提供的用于访问Rest服务的客户端模板工具
     *  */
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/save")
    public CommonResult<Payment> save(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/save",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getOne/{id}")
    public CommonResult<Payment> getOne(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getOne/"+id,CommonResult.class);
    }


}
