/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 *
 * @author wellington
 */
public class Archive4 {
    
    
    public static void main (String[] args) throws IOException{
        
        
        FileSystem fs = FileSystems.getDefault();
        for(FileStore store : fs.getFileStores()){
            System.out.println("Unity: "+ store.toString());
            System.out.println("Space: " + store.getTotalSpace());
            System.out.println("Space avaialable: " + store.getUsableSpace());
            System.out.println("Using space: " + (store.getTotalSpace() - store.getUsableSpace()));
        }
                
//            Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//            
//            for (Path path : dirs){
//                System.out.println(path);
//            }
//            
//            /*
//                List all content directory
//            */
//            
//            Path dir = Paths.get("C:/");
//            try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
//
//                for(Path path : stream){
//                    System.out.println(path.getFileName());
//                }
//                
//            } catch (IOException | DirectoryIteratorException e){
//                e.printStackTrace();
//            }
//            
//            
            
            
            
            
            
    }
    
}
