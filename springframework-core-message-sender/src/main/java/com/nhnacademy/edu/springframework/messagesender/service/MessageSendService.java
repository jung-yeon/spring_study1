package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender smsmessageSender;
    private MessageSender emailmessageSender;


    //Constructor Injection 의 예
    public MessageSendService(MessageSender smsmessageSender,MessageSender emailmessageSender){
        this.smsmessageSender = smsmessageSender;
        this.emailmessageSender = emailmessageSender;
    }
    public MessageSendService(){

    }

    //setter
    public void setEmailMessageSender(MessageSender emailMessageSender){
        System.out.println("set EmailMessageSend");
        this.emailmessageSender = emailMessageSender;
    }


    public void doSendMessage() {
//        smsmessageSender.sendMessage(new User("abc@com" ,"01086819533"), "message");
        //construtor Injection일 때 필요
        emailmessageSender.sendMessage(new User("abc@com" ,"01012340123"), "message");
    }
}
