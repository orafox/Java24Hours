package com.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class WebSiteReader {
    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlconn = null;

        try {
            url = new URL("http://google.com");
            urlconn = url.openConnection();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Can't connect to the provideed url" + e.getMessage());
        }

        try (InputStreamReader inputStream = new InputStreamReader(urlconn.getInputStream(), "UTF8");
             BufferedReader buff = new BufferedReader((inputStream))) {
            while (true) {
                nextLine = buff.readLine();
                if (nextLine != null) {
                    System.out.println(nextLine);

                } else
                    break;
            }
        } catch (IOException e) {
            System.out.println("can't read from the internet " + e.getMessage());
        }


        try {

//            Proxy myProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("http://proxy.mycompany.com", 8080));
//            url = new URL("http://googl.com/index.html");
//            urlconn = url.openConnection(myProxy);
//
            URL url1 = new URL("http://www.google.com");
            System.out.println("-----------------");
            InputStream in2 = url1.openStream();
            BufferedReader buff2 = new BufferedReader(new InputStreamReader(in2));
            while (true) {
                if ((nextLine = buff2.readLine()) != null) {
                    System.out.println(nextLine);

                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
