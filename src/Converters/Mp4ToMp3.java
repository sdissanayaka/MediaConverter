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
        System.out.println("File name: "+name);
        
        // Print start file converting
        System.err.println("Start Converting");

        // Create the destination file in target folder
        File ConvertedFileMp3 = new File("C:\\samples\\Mp4ToMp3_Converted\\"+name.replace(".mp4","")+".mp3");
        
        //set attributes for video conversion
        AudioAttributes audio = new AudioAttributes();
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("mp3");
        attr.setAudioAttributes(audio);
        
        // Do the converting 
        Encoder encode=new Encoder();
        try{
        encode.encode(video, ConvertedFileMp3, attr);
            System.err.println("File Converting Finished"+ConvertedFileMp3);
        }catch(Exception e){
            System.err.println(e.toString());
        }
        
    }
    
}
