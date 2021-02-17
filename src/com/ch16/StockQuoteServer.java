package com.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class StockQuoteServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket client = null;
        BufferedReader inBound = null;
        OutputStream outbound = null;
        try {
            serverSocket = new ServerSocket(3000);

            System.out.println("waiting for q quote request");
            while (true) {
                client =serverSocket.accept();

                inBound = new BufferedReader(new InputStreamReader(client.getInputStream()));
                outbound = client.getOutputStream();
                String symbol = inBound.readLine();
                String price = (new Double((Math.random() * 100))).toString();
                outbound.write(("\n the Price of " + symbol + " is " + price + "\n").getBytes(StandardCharsets.UTF_8));
                outbound.write("End\n".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            System.out.println("Error in server:" + e);
            e.printStackTrace();
        }finally {
            try {
                inBound.close();
                outbound.close();
            } catch (Exception e) {
                System.out.println("stock");
                e.printStackTrace();
            }
        }


    }

}
