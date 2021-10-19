package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {

    public static void main(String[] args) {
        File file = new File("/home/vaibhav/workspace/Sept16/src/filehandling/text.txt");
        try {
            FileOutputStream fileOutputStream= new FileOutputStream(file);
            String str = "Welcome";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("file write successfully");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
