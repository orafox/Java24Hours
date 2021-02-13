package com.ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownload2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("not enough argument");
            System.exit(-1);

        }
        URLConnection connection = null;
        try {
            URL url = new URL(args[0]);
            connection = url.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileOutputStream fOut = new FileOutputStream(args[1]);
             InputStream inpt = connection.getInputStream()) {
            System.out.println("starting downloading");

            int data;
            while ((data = inpt.read()) != -1) {
                fOut.write(data);

            }

            System.out.println("finish downloading");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
