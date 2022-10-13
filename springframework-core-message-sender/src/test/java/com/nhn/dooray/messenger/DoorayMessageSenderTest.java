package com.nhn.dooray.messenger;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

public class DoorayMessageSenderTest {
    @Autowired
    private MessageSendService messageSendService;
    @Test
    public void test(){
        ReflectionTestUtils.setField(messageSendService, "doorayMessageSender",new DoorayMessageSender() );
        boolean actual = messageSendService.doSendMessage().equals("true");
        Assertions.assertThat(actual).isTrue();
    }
}
