package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhn.dooray.messenger.DoorayMessageSender;
import com.nhnacademy.edu.springframework.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;
    private DoorayMessageSender doorayMessageSender;
    private MessageSender smsmessageSender;
    private MessageSender emailmessageSender;

    @Value("${from}")
    private String name;

    public MessageSendService(){

    }
    //아래처럼 한다면 final으로 사용할 수 있다.
//    @Autowired
//    public MessageSendService(@SMS("smsMessageSender") MessageSender messageSender,  @Value("${from}") String name){
//        System.out.println("-------Constructor Injection------");
//        this.name = name;
//        this.messageSender = messageSender;
//    }
    @Autowired
    public MessageSendService(@SMS MessageSender messageSender){
        System.out.println("-------Constructor Injection------");
        this.messageSender = messageSender;
    }
    @Autowired
    public MessageSendService(@SMS DoorayMessageSender dooraymessageSender){
        System.out.println("-------Constructor Injection------");
        this.doorayMessageSender = dooraymessageSender;
    }
    //Constructor Injection 의 예
    public MessageSendService(MessageSender smsmessageSender,MessageSender emailmessageSender){
        this.smsmessageSender = smsmessageSender;
        this.emailmessageSender = emailmessageSender;
    }


    //setter
    public void setEmailMessageSender(MessageSender emailMessageSender){
        System.out.println("set EmailMessageSend");
        this.emailmessageSender = emailMessageSender;
    }
    public void setSmsMessageSender(MessageSender smsMessageSender){
        System.out.println("set SmsMessageSend");
        this.smsmessageSender = smsMessageSender;
    }



    public String doSendMessage() {
//        smsmessageSender.sendMessage(new User("abc@com" ,"01086819533"), "message");
        //construtor Injection일 때 필요
        System.out.println("from : " + name);
        messageSender.sendMessage(new User("99dlwjddus@naver.com" ,"010-8681-9533"), "message");
        return "true";
    }
}
