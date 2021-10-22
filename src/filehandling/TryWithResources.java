package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResources {

    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream
                     = new FileOutputStream("/home/vaibhav/workspace/Sept16/src/filehandling/sample2.txt")){
            String str = "hello";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(arr);
            System.out.println("Successfully file write");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream
                     =  new FileInputStream("/home/vaibhav/workspace/Sept16/src/filehandling/sample2.txt")){
            int i =  fileInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
