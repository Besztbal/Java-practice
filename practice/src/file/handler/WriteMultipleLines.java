package file.handler;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {
        writeSingleLine("my-file.txt","alma",5);

    }

    public static void writeSingleLine(String filename,String word, int numberOfLines) {
        List<String> content = new ArrayList<>();
        for (int i=1; i<=numberOfLines;i++){
            content.add(word);
        }
        Path filePath = Paths.get(filename);
        try {
            Files.write(filePath, content);

        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}
