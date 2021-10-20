package filehandling;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {
//character stream
        File file = new File("/home/vaibhav/workspace/Sept16/src/filehandling/fileWrite.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            String str = "I  am  in Pune";
            fileWriter.write(str);
            System.out.println("file write successfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
