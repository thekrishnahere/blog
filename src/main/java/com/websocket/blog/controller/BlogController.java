package com.websocket.blog.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {

  @MessageMapping("/topic/activity") // this is the endpoint to trigger, which will process
  // message in function.
  @SendTo("/topic/blog") //"/topic" -> subscribed topic to which we have to send the above
  // processed message.
  public String sendActivity(@Payload String message) {
    return message + " appending \'from server\'";
  }


}
