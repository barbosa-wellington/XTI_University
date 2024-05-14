/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author wellington
 */
public class Archive {
    
    public static void main(String [] args) throws IOException{
    
    Path waypath = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/text.txt");
        System.out.println("Full path " +waypath.toAbsolutePath());
        System.out.println(" This is get parent "+ waypath.getParent());
        System.out.println(waypath.getRoot());
        System.out.println("This is the name of File Name " + waypath.getFileName());
        System.out.println(waypath.getFileSystem());
        
        
        
        /* Creation of a directory */
        
//        Creating the directory.
// An file must be place after the directory, otherwise it will not be created.
        Files.createDirectories(waypath.getParent());
        
//        adding the the file on hte directory
        byte[] bytes = "My text".getBytes();
//        Write a message on the files.
        Files.write(waypath, bytes );
        
        
//        Method to obtain all the files information.
        byte[] return_data = Files.readAllBytes(waypath);
//        Printing the file information.
        System.out.println(new String(return_data));
        
    }
    
}
