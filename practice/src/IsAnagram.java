import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class IsAnagram {

    public static void main(String[] args) {
        String a = "xyzw";
        String b = "xyxy";
        System.out.println(isAnagram3(a, b));

    }

    static boolean isAnagram(String a, String b) {

        char[] stringA = a.toLowerCase().toCharArray();
        char[] stringB = b.toLowerCase().toCharArray();
        int n1 = a.length();
        int n2 = b.length();

        Arrays.sort(stringA);
        Arrays.sort(stringB);

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (stringA[i] != stringB[i]) return false;
        }
        return true;
    }

    static boolean isAnagram2(String a, String b) {
        int n1 = 0;
        int n2 = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            n1 += (int) a.charAt(i);
            n2 += (int) b.charAt(i);
        }
        System.out.println(n1);
        System.out.println(n2);
        if (n1 != n2) return false;
        return true;
    }

    static boolean isAnagram3(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        boolean ret = false;
        StringBuilder c = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < c.length(); j++) {
                    if (a.charAt(i) == c.charAt(j)) {
                        c.deleteCharAt(j);
                        if (i == a.length() - 1 && c.length() == 0) {
                            ret = true;
                            break;
                        }
                        break;

                    }

                }
            }
        }
        return ret;
    }

}

