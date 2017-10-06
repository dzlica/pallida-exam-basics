import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    ArrayList<Character> testOutput = new ArrayList<>();
    ArrayList<Character> testOutput2 = new ArrayList<>();
    ArrayList<Character> testOutput3 = new ArrayList<>();
    testOutput.add("n");

    String testWord1 = "anagram";
    String testWord2 = "longerthanthefirstone";
    String testWord3 = "aaaaaaaaargh";

    @Test
    public void testUniqueCharacters() {
        assertEquals(testOutput, testWord1);
    }

    @Test
    public void testUniqueCharacters2() {

    }

    @Test
    public void testUniqueCharacters3() {

    }

}