package com.nhnacademy.edu.springframework.xml;

import com.nhnacademy.edu.springframework.config.MainConfig;
import com.nhnacademy.edu.springframework.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        String basePackage = "com.nhnacademy.edu.springframework";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);

        MessageSendService messageSendService = context.getBean(MessageSendService.class);

        messageSendService.doSendMessage();


        //리팩토링에 유리
        //MessageSender emailMessageSender = MessageSender.class.cast(context.getBean("emailMessageSender"));
        //MessageSender smsMessageSender = context.getBean("smsMessageSender",MessageSender.class);
        // MessageSender emailMessageSender = context.getBean("emailMessageSender",MessageSender.class);
        //User user = new User("abcd@abc.com","010-1111-2222");
        //smsMessageSender.sendMessage(user,"sms");
        // emailMessageSender.sendMessage(user,"email");


        context.close();
    }
}

