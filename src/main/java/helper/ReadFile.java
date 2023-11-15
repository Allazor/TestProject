package helper;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReadFile {

    public static List<String> read() {
        String fileName = "src/test/resources/celebrityNames.txt";

        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


    public String getCelebrityName() {
        return read().stream().skip(
                new Random().nextInt(read().size())).findFirst().orElse("No names available");
    }
}
