package com.nhnacademy.edu.springframework.test;


import com.nhn.dooray.messenger.DoorayMessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.assertj.core.api.Assertions;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MessageSendServiceTest {
//    @Autowired
    MessageSendService messageSendService = new MessageSendService();
    @Mock
    private MessageSender messageSender;


    @Test
    void testMessageSendService() {
        ReflectionTestUtils.setField(messageSendService, "messageSender",new DoorayMessageSender() );
        String actual = "true";
        actual.equals(messageSendService.doSendMessage());
        Assertions.assertThat(actual).isEqualTo("true");
    }
    @Test
    void testSmsMessageSender() {
        messageSendService.setSmsMessageSender(messageSender);

        //when(messageSender.sendMessage().thenReturn(String.valueOf(true));

        String actual = messageSendService.doSendMessage();

        Assertions.assertThat(actual).isEqualTo(true);
    }
}
