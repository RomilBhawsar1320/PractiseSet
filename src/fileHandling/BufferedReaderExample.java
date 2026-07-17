package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException{

        try(FileReader fr = new FileReader("src/fileHandling/romil.txt")){

            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line.toUpperCase());
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


// Try with resource implements AutoClosable Interface which has a method close
//which close all resources
/*
try with resource is from java 1.7

BufferedReader extends Reader which implements Closable interface and it
extends autocloseable interface
 */
