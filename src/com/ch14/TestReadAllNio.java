package com.ch14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestReadAllNio {
    public static void main(String[] args) {
        Path myOutFile = Paths.get("myEmyOut.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(myOutFile, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            writer.write("Hello eman it's to hard but i will try");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path stateFile = Paths.get("stats.txt");
        try {

            List<String> states = Files.readAllLines(stateFile, StandardCharsets.UTF_8);
            states.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
