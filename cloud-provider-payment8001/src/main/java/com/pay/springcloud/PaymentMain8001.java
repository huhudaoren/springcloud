package com.pay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class PaymentMain8001 {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello8001(){
        return "欢迎访问8001端口";
    }

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }

}
