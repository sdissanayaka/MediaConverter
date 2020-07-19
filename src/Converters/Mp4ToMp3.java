/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converters;

import MediaConverter.MediaConverter;
import java.io.File;
import it.sauronsoftware.jave.*;




public class Mp4ToMp3 implements MediaConverter{
    public void Convert(String file)
    {
        //get file location and sign it as a file
        File video = new File(file);
        String name = video.getName();
        System.err.println("File Converting Started");

        File Video = new File("F:\\Bitcoin\\week 2\\index.mp3"); //asigning target folder
        //set attributes for video conversion
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
