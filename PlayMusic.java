
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wellington
 */
public class PlayMusic {
    
    

    /**
     *
     * @param filepath
     */
    public static void playMusic(String filepath){
    
        InputStream music;
        
        try{
            
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    
    }

    public static void main (String [] args){
    
    playMusic("videoplayback.m4a");
        
    }
    
    
}