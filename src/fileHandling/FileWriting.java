package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args)throws IOException {


        try(FileWriter fw = new FileWriter("src/fileHandling/javaFile.txt",true)){
           fw.write('A');
           fw.write("\n this is next line ");

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("just another statement to show end ");
        }
    }
}
