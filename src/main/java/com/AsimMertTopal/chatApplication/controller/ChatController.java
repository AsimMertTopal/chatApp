package com.AsimMertTopal.chatApplication.controller;

import com.AsimMertTopal.chatApplication.model.WebSocketMessage;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin
public class ChatController {
    @Autowired
    SimpMessagingTemplate simpleMessagingTemplate;




    @MessageMapping("/chat")
    public void createChat( @RequestBody WebSocketMessage webSocketMessage) {

         simpleMessagingTemplate.convertAndSend("/topic", webSocketMessage);

    }
}
