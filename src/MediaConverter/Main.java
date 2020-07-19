package MediaConverter;

import Readers.ReadMp4ToFlv;
import Readers.ReadMp4ToMp3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException{
        // start point 
        System.out.println("start Converting Media Files");
        
        // Create convertType object
        ConvertTypes convertType = new ConvertTypes();
        
        // Define Source files
        Map<String, String> mediaFilelink = new HashMap();
        mediaFilelink.put("mp4ToMp3Link","c://samples//Mp4ToMp3" ); 
        mediaFilelink.put("mp4ToFlvLink","c://samples//Mp4ToFlv" );
        
        // Define Objects for both converters
        ReadMp4ToMp3 readMp4ToMp3 = new ReadMp4ToMp3();
        ReadMp4ToFlv readMp4ToFlv = new ReadMp4ToFlv();
        
        // Subscribe listner for both converters
        convertType.subscribe(readMp4ToMp3);
        convertType.subscribe(readMp4ToFlv);
        
        // Triger listenfolder for subscrbed converters
        convertType.listenFolder(mediaFilelink);
        
        System.out.println("Finished Converting Media Files");
    
    }
    
}
