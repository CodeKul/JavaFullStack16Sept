package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter
                    = new FileWriter(
                            "/home/vaibhav/workspace/Sept16/src/filehandling/filewriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String str = "I  am  in Pune";
            bufferedWriter.write(str);
            System.out.println("file write successfully");
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader
                    = new FileReader(
                            "/home/vaibhav/workspace/Sept16/src/filehandling/filewriter.txt");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedReader.read();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
