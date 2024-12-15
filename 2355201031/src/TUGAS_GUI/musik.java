/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_GUI;
    import java.io.File;
    import java.io.IOException;
    import javax.sound.sampled.AudioInputStream;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;
    import javax.sound.sampled.LineUnavailableException;
    import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author alfa wijaya
 */
public class musik {
     private Clip clip;
     
     public void playMusic(String musicFilePath) {
         try {
             File musicPath = new File(musicFilePath);
             
             if (musicPath.exists()) {
                 
                 if (clip != null && clip.isRunning()) { 
                     clip.stop(); 
                 }
                 
                 AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                 clip = AudioSystem.getClip();
                 clip.open(audioInput);
                 clip.start();
             } 
             else { System.out.println("File musik tidak ditemukan.");
             } 
         } 
         catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
             e.printStackTrace();
         }
     }
     public void stopMusic() { 
         if (clip != null) {
             clip.stop(); 
         }
     } 
     public void loopMusic() {
         if (clip != null) {
             clip.loop(Clip.LOOP_CONTINUOUSLY); 
         } 
     }
   
}
