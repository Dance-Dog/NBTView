import com.dancedog.nbtview.NBTView;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

class TestParseNBT {

    @Test
    void testParseNBT() {
        JsonObject json = NBTView.readFile("/Users/ben/Desktop/NBTView/src/test/resources/bigtest.nbt");
        System.out.println(json.toString());
    }
}
