package com.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage :java Client Symbol");
            System.exit(-1);

        }
        Socket clientStock = null;
        try {
            clientStock = new Socket("localhost", 3000);

        } catch (UnknownHostException unknownHostException) {
            System.out.println("unknownHost Exception" + unknownHostException.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (OutputStream outBound = clientStock.getOutputStream();
             BufferedReader inBound = new BufferedReader(new InputStreamReader(clientStock.getInputStream()));) {
            outBound.write((args[0] + "\n").getBytes(StandardCharsets.UTF_8));
            String quote;
            while (true) {
                quote = inBound.readLine();
                if (quote.length() == 0) {
                    continue;
                }
                if (quote == "End") {
                    break;
                }
                System.out.println("Got the qoute for " + args[0] + ":" + quote);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
