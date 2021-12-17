import java.util.Scanner;

public class CheckPalindrome {

        public static void main(String[] args) {


            String A="MadaM";


            String reverse="";
            for (int i = A.length()-1; i >=0 ; i--) {
                reverse+=A.charAt(i);


            }
            if (A.compareTo(reverse)==0){
                System.out.println("Palindrome");
            }




        }
    }

