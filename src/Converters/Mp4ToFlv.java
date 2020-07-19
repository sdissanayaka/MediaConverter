package Converters;

import MediaConverter.MediaConverter;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;

public class Mp4ToFlv implements MediaConverter{
    
    @Override
    public void Convert(String file)
    {
        File videoFile = new File(file);
        String name = videoFile.getName();
        System.out.println("File name: "+name);
        
        // Print start file converting
        System.err.println("Start Converting");

        // Create the destination file in target folder
        File ConvertedFileFlv = new File("C:\\samples\\Mp4ToFlv_Converted\\"+name.replace(".mp4","")+".flv");
        
        //set attributes for video conversion
        VideoAttributes audio = new VideoAttributes();
        EncodingAttributes attr = new EncodingAttributes();
        attr.setFormat("flv");
        attr.setVideoAttributes(audio);
        
        // Do the converting 
        Encoder encode=new Encoder();
        try{
        encode.encode(videoFile, ConvertedFileFlv, attr);
            System.err.println("File Converting Finished"+ConvertedFileFlv);
        }catch(Exception e){
            System.err.println(e.toString());
        } 
        
    }
    
}
