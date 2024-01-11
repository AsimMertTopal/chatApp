package com.AsimMertTopal.chatApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebSocketMessage {

    String message;
    String sender;

    @Override
    public String toString() {
        return "WebSocketMessage{" +
                "message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }


}
