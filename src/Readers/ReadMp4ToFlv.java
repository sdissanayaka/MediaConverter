package Readers;

import Converters.Mp4ToFlv;
import MediaConverter.ReadFolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class ReadMp4ToFlv implements ReadFolder {

    @Override
    public void listen(Map<String, String> mediaLink) throws IOException {
        Mp4ToFlv convertToFlv = new Mp4ToFlv();
        String mp4ToFlvFileLink = mediaLink.get("mp4ToFlvLink");
        try (Stream<Path> paths = Files.walk(Paths.get(mp4ToFlvFileLink))) {
                List<String> mp4ToFlvList = paths.filter(Files::isRegularFile)
                         .map(p -> p.getFileName()
                                    .toString())
                         .collect(Collectors.toList());
                for (String link: mp4ToFlvList){
                    String file = "C:\\samples\\Mp4ToFlv\\"+link;                    
                    convertToFlv.Convert(file);
                }
                
                } catch (IOException e) {
                     e.printStackTrace();
                }
    }    
}
