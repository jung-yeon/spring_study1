package com.nhnacademy.edu.springframework.xml;
import com.nhnacademy.edu.springframework.aop.TimeAspect;
import com.nhnacademy.edu.springframework.config.MainConfig;
import com.nhnacademy.edu.springframework.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopMain {
    public static void main(String[] args){
        String basePackage = "com.nhnacademy.edu.springframework";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basePackage);

        MessageSendService messageSendService = context.getBean(MessageSendService.class);

        messageSendService.doSendMessage();
    }
}
