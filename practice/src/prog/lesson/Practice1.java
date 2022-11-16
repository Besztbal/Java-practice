package prog.lesson;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
//        int n;
//
//
//        Scanner scan = new Scanner(System.in);
//
//        do {
//
//            n = scan.nextInt();
//            if (n <= 0) {
//                System.out.println("A szám nem megfelő. Kérem adjon meg gy másikat.");
//            } else {
//                System.out.println("Megfelelő számot kaptunk.");
//            }
//
//
//        } while (n <= 0); //azt a tartományt adjuk meg, amelyben lvévő számokat nem fogadjuk el.

//        System.out.println("Megfelelő számot kaptunk.");


//        if (n>0){
//            System.out.println("Positive");
//        } else if (n<0){
//            System.out.println(" Negative");
//        } else {
//            System.out.println("Nulla");
//        }
//

        /*
        if (n>0){
            System.out.println("Positive");
        }
        if (n<0){
            System.out.println(" Negative");
        }
        if(n==0) {
            System.out.println("Nulla");
        }
        */

        for (int i = 1; i < 10; i++) {
            if (i%2==0) {
                System.out.println(i);
                i=10;

            }
        }

        int i=1;
        boolean isEven=false; // még nem találtunk páros számot

        while (isEven==false){ // while(!isEven)
            if (i%2==0){
                System.out.println(i + "!");
                isEven=true;
            }

            i++;

        }

        i=1;

        do {
            if (i%2==0){
                System.out.println(i);
                i=9;
            }
            i++;
        } while (i<10);


    }


}
