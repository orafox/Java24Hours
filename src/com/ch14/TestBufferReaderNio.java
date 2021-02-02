package com.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestBufferReaderNio {
    public static void main(String[] args) {
        Path statesFile = Paths.get("stats.txt");
        try (BufferedReader reader = Files.newBufferedReader(statesFile, StandardCharsets.UTF_8)) {

            String stateName;
            while ((stateName = reader.readLine()) != null) {
                System.out.println("got the state "+stateName);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
