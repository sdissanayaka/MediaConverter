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
        
        // Create convertType object- Using singleton design pattern
        ConvertTypes convertType = ConvertTypes.getInstance();
        
        // Define Source files
        Map<String, String> mediaFilelink = new HashMap();
        mediaFilelink.put("mp4ToMp3Link","c://samples//Mp4ToMp3" ); 
        mediaFilelink.put("mp4ToFlvLink","c://samples//Mp4ToFlv" );
        
        // Define Objects for both converters - factory method implemented
        ReadFolderFactory readFolderFactory  = new ReadFolderFactory();
        ReadFolder readMp4ToMp3 = readFolderFactory.getInstance(mediaFilelink);
        ReadFolder readMp4ToFlv = readFolderFactory.getInstance(mediaFilelink);

        // Subscribe listner for both converters
        convertType.subscribe(readMp4ToMp3);
        convertType.subscribe(readMp4ToFlv);
        
        // Triger listenfolder for subscrbed converters
        convertType.listenFolder(mediaFilelink);
        
        System.out.println("Finished Converting Media Files");
    
    }
    
}
