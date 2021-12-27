package file.handler;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BirthDates {
    public static void main(String[] args) {
        yearOfBirths("births.csv");


    }

    public static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(fileName);
        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {

        } finally {
            return lines;
        }

    }

    public static void yearOfBirths(String file) {
        List<String> lines = readFile(file);
        HashMap<Integer, Integer> years = new HashMap<>();
        for (String line : lines) {
            String[] cols = line.split(";");
            int year = Integer.parseInt(cols[1].split("-")[0]);
            if (years.get(year) == null) {
                years.put(year, 1);
            } else {
                years.put(year, years.get(year) + 1);
            }
        }
        int maxValueInMap = (Collections.max(years.values()));  // This will return max value in the HashMap
        for (Map.Entry<Integer, Integer> entry : years.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }

        }


    }
}


