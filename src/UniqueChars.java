import java.util.ArrayList;

public class UniqueChars {
    public static void main(String[] args) {


        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }

    private static ArrayList<Character> uniqueCharacters(String inputWord) {
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> duplicates = new ArrayList<>();

        for (int i = 0; i < inputWord.length(); i++) {
            if (!result.contains(inputWord.charAt(i))) {
                if (!duplicates.contains(inputWord.charAt(i))) {
                    result.add(inputWord.charAt(i));
                } else {
                    result.remove((Character) inputWord.charAt(i));
                    duplicates.add(inputWord.charAt(i));
                }
            }
        }
        return result;
    }
}
