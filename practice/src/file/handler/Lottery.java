package file.handler;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

public class Lottery {

    public static void main(String[] args) {

        lotteryNumbers("lottery.csv");
    }

    public static void lotteryNumbers(String file) {
        List<String> lines = readFile(file);
        HashMap<Integer, Integer> years = new HashMap<>();
        for (String line : lines) {
            String[] cols = line.split(";");
            int beg = 11, end = 16;
            String[] subarray = IntStream.range(beg, end)
                    .mapToObj(i -> cols[i])
                    .toArray(String[]::new);
            for (int i = 0; i < subarray.length; i++) {
                int year = Integer.parseInt(subarray[i]);
                if (years.get(year) == null) {
                    years.put(year, 1);
                } else {
                    years.put(year, years.get(year) + 1);
                }
            }

        }

        System.out.println(fiveHighestValue(years));


    }

    public static List<Integer> fiveHighestValue(HashMap<Integer, Integer> myHashmap) {
        List<Integer> list = new ArrayList<Integer>(myHashmap.values());
        Collections.sort(list, Collections.reverseOrder());
        List<Integer> top5 = list.subList(0, 5);
        System.out.println(top5);
        Set<Map.Entry<Integer, Integer>> set = myHashmap.entrySet();
        List<Integer> topFive=new ArrayList<>();
        int maxValueInMap = (Collections.max(myHashmap.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : myHashmap.entrySet()) {  // Itrate through hashmap
            if (top5.contains(entry.getValue())) {
                topFive.add(entry.getKey());
            }


        }
        return topFive;
    }

    private static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(fileName);
        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {

        } finally {
            return lines;
        }
    }
}



