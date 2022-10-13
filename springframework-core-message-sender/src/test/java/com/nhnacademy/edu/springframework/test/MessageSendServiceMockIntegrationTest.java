package com.nhnacademy.edu.springframework.test;


import com.nhn.dooray.messenger.DoorayMessageSender;
import com.nhnacademy.edu.springframework.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={MainConfig.class})
public class MessageSendServiceMockIntegrationTest {
    @Autowired
    private MessageSendService messageSendService;


    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void init(){

    }

    @Test
    public void test(){
       // MockitoAnnotations.initMocks(this);
        messageSendService.doSendMessage();

    }
}
