/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converters;

import MediaConverter.MediaConverter;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;

/**
 *
 * @author acer
 */
public class Mp4ToFlv implements MediaConverter{
    public void Convert(String file)
    {
        File video = new File(file);
        String name = video.getName();
        System.err.println("File Converting Started");

        File Video = new File("F:\\Bitcoin\\week 2\\index.mp3"); //asigning target folder
        //set attributes for video conversion
        VideoAttributes audio = new VideoAttributes();
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("flv");
        attr.setVideoAttributes(audio);
        
        Encoder encode=new Encoder();
        try{
        encode.encode(video, Video, attr);
            System.err.println("File Converting Finished");
        }catch(Exception e){
            System.err.println(e.toString());
        }
        
    }
    
}
