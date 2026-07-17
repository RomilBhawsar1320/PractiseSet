package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/fileHandling/romil.txt");
//        System.out.println(file.isFile());
//        System.out.println((file.canWrite()));
//        System.out.println(file.isDirectory());
//        System.out.println((file.length()));


        try (FileReader fileRead = new FileReader(file)){

            int ch = fileRead.read();

            while (ch != -1){
                System.out.print((char) ch);
                 ch = fileRead.read();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
            throw new FileNotFoundException();
        }
    }
}


// Buffered Reader is line by line and File reader is character by character
