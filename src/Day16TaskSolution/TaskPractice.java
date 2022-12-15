package Day16TaskSolution;

import java.util.Scanner;

public class TaskPractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your two positive numbers ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        scan.close();
        int total=0;
        if (num2<=0 || num1 <=0){
            System.out.println("invalid");
        }else{
            for (int i = 0; i <=num1; i++) {
                total+=num2;
            }
        }
        System.out.println(total);




    }
}


/*
Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */

