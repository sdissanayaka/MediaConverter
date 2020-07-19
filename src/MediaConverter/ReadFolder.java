package MediaConverter;

import java.io.IOException;
import java.util.Map;

public interface ReadFolder  {
    
    void listen(Map<String, String> mediaLink) throws IOException;    
}
