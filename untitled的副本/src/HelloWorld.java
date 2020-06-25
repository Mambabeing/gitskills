import property.Season;

import java.util.Scanner;



public class HelloWorld {
    public static void main(String[] args){
        Season s= Season.SPRING;
        switch(s){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        for(Season t:Season.values()){
            System.out.println(t);
        }
    }

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] b = a.toCharArray();
        fun(b);
        s.close();
    }

    public static void fun(char[] b) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 'a' && b[i] <= 'z' ||b[i] >= 'A' && b[i]<= 'Z') {
                c1++;
            } else if (b[i] >= '0' && b[i] <= '9') {
                c2++;
            } else if (b[i] == ' ') {
                c3++;
            } else c4++;
        }
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.print(c1 + " " + c2 + " " + c3 + " " + c4);

    }*/
}