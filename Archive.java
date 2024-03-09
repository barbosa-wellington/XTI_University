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
    
    Path waypath = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src");
        System.out.println("Full path " +waypath.toAbsolutePath());
        System.out.println(" This is get parent "+ waypath.getParent());
        System.out.println(waypath.getRoot());
        System.out.println(waypath.getFileName());
        System.out.println(waypath.getFileSystem());
        
        
        
        /* Creation of a directory */
          
        Files.createDirectories(waypath.getParent());
        
        
    }
    
}
