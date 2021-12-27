package file.handler;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        writeSingleLine(fileName, "Besztercei Balázs");
        readFile("my-file.txt");
        copyFileContent("my-file.txt","result.txt");


    }

    public static void writeSingleLine(String filename, String name) {
        List<String> content = new ArrayList<>();
        content.add(name);
        content.add(name);
        Path filePath = Paths.get(filename);
        try {
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }

    public static void readFile(String filename) {

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

    public static boolean copyFileContent(String source, String destination) {
        boolean success = false;

        Path sourcePath = Paths.get(source);
        Path destinationPath = Paths.get(destination);
        try {
            Files.copy(sourcePath, destinationPath);
            success=true;
            System.out.println("success");
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist.");
        } catch (IOException e) {
            System.out.println("File not found.");


        }
        return success;
    }
}

