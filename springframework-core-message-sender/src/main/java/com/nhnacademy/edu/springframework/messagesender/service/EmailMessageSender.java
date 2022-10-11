package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getEmail() + " " + message+"----Email");
    }
    public EmailMessageSender(){
        System.out.println("EmailMessageSender is created");
    }
    public void init(){
        System.out.println("+EmailMesssageSender init");
    }
}
