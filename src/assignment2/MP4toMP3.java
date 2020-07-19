/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.File;
import it.sauronsoftware.jave.*;




public class MP4toMP3 {
    public static void ConvertToAudio(File video)
    {
        System.err.println("File Converting Started");

        File Video = new File("F:\\Bitcoin\\week 2\\index.mp3");
        AudioAttributes audio = new AudioAttributes();
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("mp3");
        attr.setAudioAttributes(audio);
        
        Encoder encode=new Encoder();
        try{
        encode.encode(video, Video, attr);
            System.err.println("File Converting Finished");
        }catch(Exception e){
            System.err.println(e.toString());
        }
        
    }
    
}
