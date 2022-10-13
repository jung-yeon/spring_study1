package com.nhn.dooray.messenger;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoorayMessageSender implements MessageSender {
    public MessageSender messageSender;
    public boolean sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3036349505739914786/3371740733259172017/cdnzcggTTWmx2GtusEMUJw")
                .send(DoorayHook.builder()
                        .botName("이정연")
                        .text("안녕하세요")
                        .build());
        return true;
    }
}
