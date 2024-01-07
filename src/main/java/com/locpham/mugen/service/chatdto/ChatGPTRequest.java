package com.locpham.mugen.service.chatdto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatGPTRequest {
    // model of ai
    private String model;
    private List<Message> messages;

    public ChatGPTRequest(String model, String prompt) { //creates new object for each user input
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
