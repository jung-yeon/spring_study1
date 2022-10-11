package com.nhnacademy.edu.springframework;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("99dlwjddus@naver.com", "010-8681-9533");
        main.sendSmsMessage(user,"message");
    }
    private void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + message);
    }
    private void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent to " + user.getEmail() + message);
    }
}