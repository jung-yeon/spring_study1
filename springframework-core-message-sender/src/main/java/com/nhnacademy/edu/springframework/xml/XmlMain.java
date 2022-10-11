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

        MessageSender sender = context.getBean("smsMessageSender", MessageSender.class);
        User user = new User("xml@com","010");
        sender.sendMessage(user,"ddd");


    }
}
