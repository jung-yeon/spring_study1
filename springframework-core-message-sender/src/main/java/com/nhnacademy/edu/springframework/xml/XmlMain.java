package com.nhnacademy.edu.springframework.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        //MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
        User user = new User("xml@com","010123241234");

        System.out.println("------");
        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user,"singleton");
        System.out.println("------");
        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user,"singleton");
        System.out.println("------");
        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user,"prototype");
        System.out.println("------");
        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user,"prototype");




    }
}
