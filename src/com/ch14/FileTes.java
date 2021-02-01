package com.ch14;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileTes {
    public static void main(String[] args) {
        byte someData[] = "i like eman".getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream mmfile = new FileOutputStream("emanMos.txt")) {

            for (byte bb : someData
            ) {

                mmfile.write((int) bb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream myFlew = new FileOutputStream("eman.dat")) {
            boolean eof = false;
            String myTxt = "it is only eman ";
            byte[] bytes = myTxt.getBytes(StandardCharsets.UTF_8);
            for (byte ii :
                    bytes) {
                int byteV = (int) ii;
                myFlew.write(byteV);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try (FileInputStream myFile = new FileInputStream("eman.dat")) {
            boolean eof = false;
            while (!eof) {
                int byteVlue = myFile.read();
                System.out.println(byteVlue + " ");
                if (byteVlue == -1) {
                    eof = true;
                }
            }


        } catch (IOException e) {
            System.out.println("couldn't read file ");
        }


        try (FileInputStream myff = new FileInputStream("emanMos.txt")
             ;
             BufferedInputStream buff = new BufferedInputStream(myff)) {

            boolean eof = false;
            while (!eof) {
                int byteValue = buff.read();
                System.out.println(byteValue + " " + buff.read());
                if (byteValue == -1) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

//using file input stream
        StringBuffer buffer = new StringBuffer();
        try (FileInputStream myFile = new FileInputStream("emanMos.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF8")) {

            Reader reader = new BufferedReader(inputStreamReader);
            int ch;
            while ((ch = reader.read()) > -1) {
                buffer.append((char) ch);
            }
            buffer.toString();
            System.out.println(buffer);


        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileOutputStream myffile = new FileOutputStream("emanMosss.txt");
             Writer out = new BufferedWriter(new OutputStreamWriter(myffile, "UTF8"))) {
            String myEmy = "hello it's me";
            out.write(myEmy);


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream myFile = new FileOutputStream("myDat.dat");
             BufferedOutputStream bufferedWriter = new BufferedOutputStream(myFile);
             DataOutputStream dataOutputStream = new DataOutputStream(bufferedWriter)) {
            int myInt1 = 99, myInt2 = 55;
            float myFloat1 = 9F, myFloat2 = 5F;
            double myDouble = 5.0;
            dataOutputStream.writeInt(myInt1);
            dataOutputStream.writeInt(myInt2);
            dataOutputStream.writeDouble(myDouble);
            dataOutputStream.writeFloat(myFloat1);
            dataOutputStream.writeFloat(myFloat2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream myFile = new FileInputStream("myDat.dat")
             ; BufferedInputStream buff = new BufferedInputStream(myFile);
             DataInputStream data = new DataInputStream(buff)) {
            int num1 = data.readInt();
            int num2 = data.readInt();
            float num3 = data.readFloat();
            float num4 = data.readFloat();
            double num5 = data.readDouble();
            System.out.println(num1 + "-" + num2 + "-" + num3 + "-" + num4 + "-" + num5);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File file = new File("emanMostafa.txt");
            File backup = new File("emanMostafaBackup.txt");
            file.createNewFile();
            backup.createNewFile();
            if (file.exists()) {
                System.out.println("it is exist");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
