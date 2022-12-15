package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int  age= input.nextInt();//19
        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
         input.nextLine();
        System.out.println("school name");
        String schoolName = input.nextLine();

        System.out.println("Enter your gpa");
       double gpa = input.nextDouble();//3.5
        input.nextLine();// Enter

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);
        input.close();




    }
}
/*
1.ask the user to enter age (nextInt())
2.ask the user to enter full name (nextLine())
 */