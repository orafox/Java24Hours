package com.ch14;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestFilesPaths {
    public static void main(String[] args) {
        Path sourcFilePath = Paths.get("stats.txt");
        Path destfilePath = Paths.get("states.bak");
        if (Files.exists(sourcFilePath)) {
            System.out.println("the file " + sourcFilePath + " exists");
            System.out.println("the absolute path is " +
                    sourcFilePath.toAbsolutePath());
            try {
                System.out.println("it's size " + Files.size(sourcFilePath));

                Files.copy(sourcFilePath, destfilePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("copy compeleted the backup file is at " + destfilePath.toAbsolutePath());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
