package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getPhoneNumber()  + " " + user.getEmail() + " " + message+"----smsmessage");
    }
}
