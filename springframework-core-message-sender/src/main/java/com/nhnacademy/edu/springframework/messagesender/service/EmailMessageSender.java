package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " " + message);
    }
    public EmailMessageSender(){
        System.out.println("EmailMessageSender is created");
    }
    public void init(){
        System.out.println("+EmailMesssageSender init");
    }
    public void cleanup(){
        System.out.println("destroy method called in EmailMessageSender");
    }
}
