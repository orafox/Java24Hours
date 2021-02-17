package com.listFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFileDirs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("can't arg to be null");
            System.exit(-1);
        }

        try (Stream<Path> walk = Files.walk(Paths.get(args[0]))) {
            List<String> lists = walk.filter(Files::isRegularFile).map(x ->
                    x.toString()).collect(Collectors.toList());
            lists.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
