package com.playground.java.httpServerPort;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsServer;
import com.sun.net.httpserver.spi.HttpServerProvider;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Connection extends HttpServerProvider {
    @Override
    public HttpServer createHttpServer(InetSocketAddress addr, int backlog) throws IOException {
        InetSocketAddress unresolved = InetSocketAddress.createUnresolved("192.168.0.2", 443);
        System.out.println(unresolved.getHostName());

        System.out.println(unresolved.getAddress());
        return null;
    }

    @Override
    public HttpsServer createHttpsServer(InetSocketAddress addr, int backlog) throws IOException {
        return null;
    }
}
