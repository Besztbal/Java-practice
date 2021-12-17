import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(S.substring(start, end));


        String s = "wellcometojava";
        System.out.println(getSmallestAndLargest(s, 3));


    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String subs = s.substring(i, i + k);
            if (subs.compareTo(smallest) < 0) {
                smallest = subs;
            }
            if (subs.compareTo(largest) > 0) {
                largest = subs;
            }



        }
        return smallest +"\n"+ largest;
    }
}

