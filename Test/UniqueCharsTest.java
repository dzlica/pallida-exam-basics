import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    //ArrayList<Character> testOutput = new ArrayList<>();
    String testWord1 = "anagram";
    String testWord2 = "somethinglongerthanthefirstone";
    String testWord3 = "aaa";

    @Test
    public void testUniqueCharacters() {
        assertEquals(("n", "g", "r", "m"), testWord1);
    }

}