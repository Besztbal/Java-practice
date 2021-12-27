package file.handler;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        printEachLine(fileName);
        System.out.println(countLines(fileName));
    }

    public static void printEachLine(String filename) {

        Path path = Paths.get(filename);

        try {
            List<String> content = Files.readAllLines(path);
            for (int i = 1; i <= content.size(); i++) {
                System.out.println(i + ": " + content.get(i - 1));
            }

        } catch (IOException e) {
            System.out.println("Unable to read file: " + filename);
        }
    }

    public static int countLines(String filename) {
        int lineCount = 0;

        Path path = Paths.get(filename);

        try {
            List<String> content = Files.readAllLines(path);
            for (int i = lineCount; i<content.size(); i++) {
                lineCount++;
            }

        } catch (IOException e) {
            System.out.println("Unable to read file: " + filename);
        }
        return lineCount;
    }


}

