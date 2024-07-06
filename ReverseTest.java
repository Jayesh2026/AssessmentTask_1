
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Test
    public void reverseWordsTest() {
        assertEquals("olleH", Reverse.reverseWords("Hello"));

        assertEquals("olLeH", Reverse.reverseWords("HeLlo"));

        assertEquals("hsetiH.", Reverse.reverseWords("Hitesh."));

        assertEquals("Hello!", Reverse.reverseWords("olleH!"));

        assertEquals("lihkiN?", Reverse.reverseWords("?Nikhil"));
    }

}
