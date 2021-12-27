package file.handler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIPAddress("log.txt")));
        System.out.println(gpRatio("log.txt"));
    }

    public static String[] getIPAddress(String fileName) {
        String IPAddress;

        Path path = Paths.get(fileName);
        List<String> content = new ArrayList<>();
        List<String> newtext = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] IPArray = new String[0];
        for (String s : content) {
            IPAddress = s.split(" ")[8];

            if (!newtext.contains(IPAddress)) {
                newtext.add(IPAddress);
            }
            IPArray = new String[newtext.size()];
            for (int i = 0; i < newtext.size(); i++) {
                IPArray[i] = newtext.get(i);
            }

        }
        System.out.println(IPArray.length);
        return IPArray;

    }
    private static float gpRatio(String fileName) {
        Path path = Paths.get(fileName);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int get = 0;
        int post = 0;

        for (String s : content) {
            if (s.split(" ")[11].contains("GET")) {
                get++;
            } else if (s.split((" "))[11].contains("POST")) {
                post++;
            }

        }
        float ratio = (float) get / post;
        return ratio;
    }
}
