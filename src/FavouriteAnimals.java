import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;


public class FavouriteAnimals {
    public static void main(String[] args) {

        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them


        // If ran from the command line without arguments
        if (args.length == 0) {
            System.out.println("java FavouriteAnimals [animal] [animal]");
        }


        // Each animal should be written in separate lines
        Path myPath = Paths.get("/Users/lica/GreenFox/pallida-exam-basics/src/favourites.txt");
        ArrayList<String> linesOfFavourites = new ArrayList<>();

        try {
            linesOfFavourites = (ArrayList <String>) Files.readAllLines(myPath);
        } catch (Exception e) {
            System.out.println("Unreadable your file");
        }

        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once

        for (int i = 0; i < args.length; i++) {
            if (!linesOfFavourites.contains(args[i]))
            linesOfFavourites.add(args[i]);
        }

        try {
            Files.write(myPath, linesOfFavourites);
        } catch (Exception e) {
            System.out.println("Unable to write to file your favourite animals");
        }



    }
}
