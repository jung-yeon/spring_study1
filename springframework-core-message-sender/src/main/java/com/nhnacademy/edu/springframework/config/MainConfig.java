package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath:/beans.xml")
public class MainConfig {
    @Bean
    public MessageSender smsMessageSender(){
        return new SmsMessageSender();
    }
    @Bean
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }

}
