package Day16TaskSolution;

import java.util.Scanner;

public class day16TaskSolution {
    public static void main(String[] args) {

        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int numbers = input.nextInt();
            if (numbers>0){
                numberOfPositives += 1;
            }
            if (numbers<0){
                numberOfNegatives += 1;
            }
        }
        System.out.println(numberOfPositives + " positive and " + numberOfNegatives + " negative" );
        input.close();








    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */




/*
 Scanner input = new Scanner(System.in);
            System.out.println("Enter two positive numbers:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = 0;
            if (num1>0 && num2>0){
                for (int j = 1; j <=num2 ; j++) {
                    result += num1;
                }
                System.out.println(num1 + " multiplied by " + num2 + " equals " + result);
            }else{
                System.out.println("Invalid number");
            }
        input.close();
 */



