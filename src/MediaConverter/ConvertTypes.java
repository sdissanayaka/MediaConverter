package MediaConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConvertTypes {
    
    private static ConvertTypes instance = null;
    
    private ConvertTypes(){
    
    }
    
    public static ConvertTypes getInstance(){
    
        if (instance == null){
            instance = new ConvertTypes();
        }
        return instance;
    }
    List<ReadFolder> readFolderList = new ArrayList<>();
    
    public void subscribe(ReadFolder readFolder){
        readFolderList.add(readFolder);
    }
    public void unSubscribe(ReadFolder readFolder){
        readFolderList.remove(readFolder);
    }
    
    
    public void listenFolder (Map<String, String> mediaFilelink) throws IOException{
        
        while (true) {
                for (ReadFolder readFolder:readFolderList ){
                    readFolder.listen(mediaFilelink); 
                }
	    }
        
        
    }
    
}
