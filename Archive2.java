/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author wellington
 */
public class Archive2 {
    
    public static void main(String[] args) {
    
    Path path = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/text.txt");
    //    Find a patterns of write.
    Charset utf8 = StandardCharsets.UTF_8;
    

    // Writing on a file.
    try (BufferedWriter w = Files.newBufferedWriter(path, utf8)){
    //    This is a stream for file with characteres
    //buffer is a data store on memory
    
    w.write("We are writing on a file. \n");
    w.write("Here we are writing a gain on this file. \n");
//    The command flush is use to store the data on the disc
//    w.flush();
//      On new Java version, the option for flush and close file don't need to be implemented
// since it is done automatically. 
// However, it still need to be implement if there is a high volume of data writing.

    
    } catch (IOException e){
        e.printStackTrace();
    } 
    
    
    
    
    //    Reading from a file.
    try ( BufferedReader r = Files.newBufferedReader(path, utf8)){
        String line = null;
        
        while((line = r.readLine()) != null){
            System.out.println(line);
        }
               
    } catch (IOException e) {
        e.printStackTrace();
       }
    
    
    
    
    }
    
    

    
    
}
