package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferOutputDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "/home/vaibhav/workspace/Sept16/src/filehandling/bufferDemo.txt");
            BufferedOutputStream bufferedOutputStream
                    = new BufferedOutputStream(fileOutputStream);
            String str = "Pune";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);

            bufferedOutputStream.write(arr);
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedInputStream bufferedInputStream
                    = new BufferedInputStream(
                            new FileInputStream(
                                    "/home/vaibhav/workspace/Sept16/src/filehandling/bufferDemo.txt")
            );
            int i = bufferedInputStream.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
