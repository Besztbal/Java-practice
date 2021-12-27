package file.handler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {


        decryptDoubled("encoded-lines.txt");
    }


    private static void decryptDoubled(String fileName) {
        List<String> decodedText = new ArrayList<>();

        Path path = Paths.get(fileName);
        Path output = Paths.get("new-text.txt");

        try {
            decodedText = Files.readAllLines(path);
            for (String s : decodedText) {
                StringBuilder newText=new StringBuilder();
//                String newText="";
                for (int i = 0; i < s.length(); i++) {
                    int chr = s.charAt(i);
                    if (chr == 32) {
                        newText.append((char) (chr));
                    } else {
                        newText.append((char) (chr - 1));
                    }
//                    newText+="\n";


                }
                newText.append("\n");

                Files.write(output, newText.toString().getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            }

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
