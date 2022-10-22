package tom.streamdemo.model;
import org.junit.jupiter.api.Test;




import java.time.LocalDateTime;
import java.util.UUID;

public class LiveStreamTest {

    @Test
    void create_new_mutable_live_stream() {
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Tom Title");
        stream.setDescription("ok");
        stream.setUrl("tom.com");
        stream.setStartDate(LocalDateTime.now());
        stream.setEndDate(LocalDateTime.now());



    }
}
