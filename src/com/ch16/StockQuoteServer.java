package com.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import static java.lang.Double.valueOf;

public class StockQuoteServer {
    public static void main(String[] args) {
        ServerSocket serverSocket =null;
        Socket client = null;
        BufferedReader inBound = null;
        OutputStream outBound = null;
        try {

            serverSocket = new ServerSocket(3000);
            System.out.println("start waiting for a quote request");
            while (true) {
                client = serverSocket.accept();
                inBound = new BufferedReader(new InputStreamReader(client.getInputStream()));
                outBound = client.getOutputStream();
                String symbol = inBound.readLine();
              String price = (new Double(Math.random()*100)).toString();
//                String price = (valueOf(Math.random() * 100)).toString();
                System.out.println(price);
                outBound.write(("\n The Price of " + symbol + " is " + price + "\n").getBytes(StandardCharsets.UTF_8));
                System.out.println("Request for " + symbol + " has been processed - the price of " + "\n");
                outBound.write("End \n".getBytes(StandardCharsets.UTF_8));

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in server: " + e);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inBound.close();
                outBound.close();

            } catch (Exception e) {
                System.out.println("stock server can't close streams " + e.getMessage());
            }
        }


    }
}
