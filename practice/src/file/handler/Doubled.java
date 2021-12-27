package file.handler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        decryptDoubled("duplicated-chars.txt");
        reversedLine("my-file.txt");
        reverseOrder("output.txt");


    }

    public static void reversedLine(String filename) {

        Path path = Paths.get(filename);
        Path output = Paths.get("output.txt");
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(path);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        List<String> newText = new ArrayList<>();
        for (int i = 0; i < content.size(); i++) {
            String currentLine = content.get(i);
            StringBuilder reversedLine = new StringBuilder();
            for (int j = currentLine.length() - 1; j >= 0; j--) {
                reversedLine.append(currentLine.charAt(j));
            }
            newText.add(reversedLine.toString());
        }
        try {
            Files.write(output, newText);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void decryptDoubled(String fileName) {
        List<String> decodedText = new ArrayList<>();
        Path path = Paths.get(fileName);
        Path output = Paths.get("output.txt");

        try {
            decodedText = Files.readAllLines(path);
            for (String s : decodedText) {
                StringBuilder currentLineText = new StringBuilder();
                for (int j = 0; j < s.length(); j += 2) {
                    currentLineText.append(s.charAt(j));
                }
                currentLineText.append("\n");
                Files.write(output, currentLineText.toString().getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            }
        } catch (IOException e) {
            e.printStackTrace();


        } finally {

        }
    }

    public static void reverseOrder(String fileName){
        List<String>content=new ArrayList<>();
        Path path=Paths.get(fileName);
        Path output=Paths.get("output2.txt");

        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> newText=new ArrayList<>();
        for (int i=content.size()-1;i>0;i--) {
            newText.add(content.get(i));
        }
        try {
            Files.write(output,newText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

