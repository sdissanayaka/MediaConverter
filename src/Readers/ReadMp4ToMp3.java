package Readers;

import Converters.Mp4ToMp3;
import MediaConverter.ReadFolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Map;

public class ReadMp4ToMp3 implements ReadFolder {

    @Override
    public void listen(Map<String, String> mediaLink) throws IOException {
        
        Mp4ToMp3 convertToMp3 = new Mp4ToMp3();
        
        String mp4ToMp3FileLink = mediaLink.get("mp4ToMp3Link");
        try (Stream<Path> paths = Files.walk(Paths.get(mp4ToMp3FileLink))) {
                List<String> mp4ToMp3List = paths.filter(Files::isRegularFile)
                         .map(p -> p.getFileName()
                                    .toString())
                         .collect(Collectors.toList());
                for (String link: mp4ToMp3List){ 
                    String file = "C:\\samples\\Mp4ToMp3\\"+link;
                    convertToMp3.Convert(file);
                }
                
                } catch (IOException e) {
                     e.printStackTrace();
                }
    }
    
}
