public class StrinToken {
    public static void main(String[] args) {

        int num = 4;
        for(int i=1;i<=num;i++){
            System.out.println(num);
            num=num/2;
        }


        String s = "He is a very very good boy, isn't he?";


        String REGEX = "['!?,._@ ]+";
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] splitS = s.split(REGEX);
            System.out.println(splitS.length);
            for (String e : splitS) {
                //Do your stuff here
                System.out.println(e);
            }
        }
    }
}
