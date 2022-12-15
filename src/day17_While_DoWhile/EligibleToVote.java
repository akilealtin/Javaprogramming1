package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();//-20 valid age :1-20
        while (!(age>=1 && age>=120)){//while the age number is invalid
            System.err.println("invalid entr,please re-enter");
            System.out.println("Enter your age");
            age=scan.nextInt();
        }
        System.out.println("are you usa citizen? yes/no");

        String answer = scan.next();
        while (!(answer.equals("yes")|| answer.equals("no"))) {
            System.out.println("Invalid entry,please re-enter");
            System.out.println("Are you a US citizen? yes/no");
            answer=scan.next().toLowerCase();
        }
        if (age>=18 && answer.equals("yes")){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }
    }
}
