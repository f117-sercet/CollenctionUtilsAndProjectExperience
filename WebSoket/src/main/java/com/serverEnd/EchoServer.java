package com.serverEnd;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2024/4/3 18:16
 */
@ServerEndpoint("/echo")
public class EchoServer {

    @OnOpen
    public void onOpen(Session session){
        System.out.println("WebSocket server started");
    }
}
