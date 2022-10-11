package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private final  MessageSender messageSender;
    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        messageSender.sendMessage(new User("99dlwjddus@naver.com","01086819533"),"message");
    }
}
