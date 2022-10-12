package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.nhnacademy.edu.springframework")
@PropertySource("classpath:greeting.properties")
public class ServiceConfig {
    @Autowired
    private MainConfig mainConfig;


    @Bean
    public MessageSendService MessageSendService(){
        return new MessageSendService(mainConfig.smsMessageSender());
    }
}
