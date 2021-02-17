package com.listFiles;

import java.io.*;

public class TestListFiles {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("your should pass file path");
            System.exit(-1);
        }
        FileWriter fileWriter = null;
        //BufferedOutputStream bufferedOutputStream = null;
        try {
            fileWriter = new FileWriter(args[1]);

            File myFiles = new File(args[0]);

            String[] myFileList = myFiles.list();
            for (String filePath : myFileList
            ) {
                fileWriter.write(filePath+"\n");
                System.out.println(filePath+" "+myFiles.length());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
