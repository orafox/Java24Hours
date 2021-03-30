package com.ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReaderStream {
    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConnection = null;

        try {
            url = new URL("http://google.com");
            urlConnection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader inStream = new InputStreamReader(urlConnection.getInputStream(), "UTF8"); BufferedReader buff = new BufferedReader(inStream);) {
            buff.lines().forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
