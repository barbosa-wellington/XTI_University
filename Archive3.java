/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author wellington
 */
public class Archive3 {
    
    
    public static void main(String[] args) throws IOException{
        
        
        Path path = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/Accounts.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        
////        Command to check if a file exist.
//        System.out.println(Files.exists(path));
//        
////        Command to check if the file is on the directory
//        System.out.println(Files.isDirectory(path));
//        
////        Check if this file is a image, txt.
//        System.out.println(Files.isRegularFile(path));
//        
////    This command help to certify that only specific persons can execute it.
//        System.out.println(Files.isExecutable(path));
////        The same goes for this.
//        System.out.println("User can read it: " + Files.isReadable(path));
//        
////        Check the attrivtes of the file.
//        System.out.println("Size File: " + Files.size(path));
//        
////        Check the last modification time of the file.
//        System.out.println("Last modification " + Files.getLastModifiedTime(path));
//        
////        See the owner of the file.
//        System.out.println("File owner: " + Files.getOwner(path));
//    
////       Identify the type of the file.
//        System.out.println("Permissions " + Files.probeContentType(path));
//    
//        
//        
////        Delete files:
//    Files.delete(path);
////    This command will only delete the file if it does exist on the directory
//    Files.deleteIfExists(path);
  

//        Create File
//        Files.createFile(path);
//        Files.delete(path);
//        Files.write(path, "My text".getBytes());
        
        
//        Copy file
        Path copyPath = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/copyFile.txt");
        Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);

        
//        Move a file.
        Path moveFile = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/movef/Accounts.txt");
        Files.createDirectories(path.getParent());
        Files.move( path,moveFile , StandardCopyOption.REPLACE_EXISTING);
    }
    
}
