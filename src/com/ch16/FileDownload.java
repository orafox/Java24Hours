package com.ch16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownload {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("proper usage java.filedownload sourcefile url outputfilename");
            System.exit(-1);

        }
        URLConnection fileStream = null;
        try {
            URL remoteFile = new URL(args[0]);
            fileStream = remoteFile.openConnection();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fOut = new FileOutputStream(args[1]);
             InputStream in = fileStream.getInputStream();) {
            int data;
            System.out.println("Starting the download from " + args[0]);
            while ((data = in.read()) != -1) {
                fOut.write(data);
            }
            System.out.println("Finish download the file " + args[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
