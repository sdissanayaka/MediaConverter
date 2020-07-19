/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaConverter;

import Readers.ReadMp4ToMp3;
import java.util.Map;

/**
 *
 * @author acer
 */
public class ReadFolderFactory {
    public ReadFolder getInstance(Map<String, String> mediaLink){
        if(mediaLink.containsKey("mp4ToMp3Link")){
            return new ReadMp4ToMp3();
        }
        if(mediaLink.containsKey("mp4ToFlvLink")){
            return new ReadMp4ToMp3();
    }
        return null;
    
}
}
