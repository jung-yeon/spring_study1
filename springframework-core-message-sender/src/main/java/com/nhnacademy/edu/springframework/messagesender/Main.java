package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    public static void main(String[] args) {

        new MessageSendService(new SmsMessageSender()).doSendMessage();
    }

}