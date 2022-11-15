package com.playground.java.httpServerPort;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HttpServerPortTest {


    public static void main(String[] args) throws IOException {
        Connection conecta = new Connection();
        HttpServer httpServer = conecta.createHttpServer(new InetSocketAddress("http://127.0.0.1", 443), 3);

        System.out.println(httpServer.getAddress());
        System.out.println(httpServer.getExecutor());

    }


}
