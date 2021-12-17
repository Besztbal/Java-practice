import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LexicographicalOrder {
    public static void main(String[] args) {

        String s="welcometojava";

        getSmallestAndLargest(s,3);
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        s=s.toLowerCase(Locale.ROOT);
        List<String> subStrings=new ArrayList<>();

        for (int i = 0; i <s.length() ; i+=2) {
            String substring = s.substring(i, i += k);
            substring=smallest;
            if((int)substring.charAt(0)<(int)smallest.charAt(0)){
                smallest=substring;
            }
            i=i+k;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
