/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.File;

/**
 *
 * @author acer
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File Video  = new File("F:\\Bitcoin\\week 1\\index.mp4");
        MP4toMP3.ConvertToAudio(Video);
        
    }
    
}
