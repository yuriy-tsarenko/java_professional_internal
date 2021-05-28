package com.java_professional.examples.lesson3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream =
                     new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
             DataInputStream inputStream =
                     new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))) {

            dataOutputStream.writeShort(1200);
            dataOutputStream.writeInt(1111);
            dataOutputStream.writeLong(10L);
            dataOutputStream.writeUTF("Hello World!!!");
            dataOutputStream.flush();

            System.out.println("Short " + inputStream.readShort());
            System.out.println("Int " + inputStream.readInt());
            System.out.println("Long " + inputStream.readLong());
            System.out.println("UTF " + inputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
