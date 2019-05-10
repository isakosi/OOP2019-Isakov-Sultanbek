import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class LevelFileNotFound extends FileNotFoundException {
    LevelFileNotFound(String message) {
        super(message);
    }
}

public class Utils {
    static ArrayList<Level> loadLevels(String filePath) throws LevelFileNotFound {
        ArrayList<Level> levels = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new BufferedReader(new FileReader(filePath)));

            String line;
            StringBuilder level = new StringBuilder();
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                level.append(line);
                level.append('\n');
                if (line.charAt(0) == ';') {
                    // end of the level
                    levels.add(Level.parseLevel(level.toString()));
                    level = new StringBuilder();
                    if (scan.hasNextLine()) scan.nextLine(); // TODO: improve multiple empty lines
                }
            }

            scan.close();
        } catch (FileNotFoundException e) {
            throw new LevelFileNotFound(
                    "The level file " + filePath + " was not found. Try to reinstall the game."
            );
        }
        return levels;
    }
}