package day15_ForLoop;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("--------------------------------------");
        //     1          2      4
        for (int i = 1; i <=20; i++){ // i:1,2.3,4,5,6,7,8,9,10,11
            System.out.println("Hello World!"); //i:1,2,3,4,5,6,7,8,9,10
        }
        System.out.println("---------------------------------");
        for (int i = 0; i <11; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        int sum=0;
        for (int i = 1; i <=10; i++) {
            sum+=i;


        }
        System.out.println(sum);
        System.out.println("---------------------------------------");
        Scanner scan=new Scanner(System.in);

        int number = 5;
        int multiplication = 0;

        for (int i = 1; i < 10; i++) {
            multiplication = number * i;
            System.out.println(number + "x" + i + "=" + multiplication);

            System.out.println("---------------------------------------");
            for (int j = 1; j < 6; j++) {
                System.out.println("*".repeat(j));

            }
        }


    }
}
