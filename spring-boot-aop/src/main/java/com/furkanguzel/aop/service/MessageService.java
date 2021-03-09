package com.furkanguzel.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String giveMessage(String param){
        System.out.println("Method gave a message param :" + param);
        return param;
    }
}
