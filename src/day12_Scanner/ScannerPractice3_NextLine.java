package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        // 123Enter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");

        String fullName= input.nextLine();// Wooden spoonEnter
        System.out.println("Enter your programming language:");

        String programming = input.nextLine();//java programming languageEnter
        System.out.println("Enter your age");//24
        int age = input.nextInt();//24
        input.nextLine();
        //capture the Entre key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName= input.nextLine();//Enter


        System.out.println("full name= " + fullName);
        System.out.println("programming =" + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        input.close();
    }
}
