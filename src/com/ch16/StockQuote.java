package com.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class StockQuote {
    static void printStockQuote(String symbol) {
        String csvString;
        URL url = null;
        URLConnection urlConn = null;

        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=" + symbol + "&f=sl1d1t1c1ohgv&e=.csv");
            urlConn = url.openConnection();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
             BufferedReader buff = new BufferedReader(inStream);) {

            csvString = buff.readLine();
            System.out.println(csvString);
            StringTokenizer tokenizer = new StringTokenizer(csvString, ",");
            String ticker = tokenizer.nextToken();
            String price = tokenizer.nextToken();
            String tradeDate = tokenizer.nextToken();
            String tradeTime = tokenizer.nextToken();
            System.out.println("Symbol :" + ticker + " price " + price + " Time " + tradeTime );


        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("sample usage java StockQuote IBM");
            System.exit(-1);

        }
        printStockQuote(args[0]);
    }
}
