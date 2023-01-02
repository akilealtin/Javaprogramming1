package practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int name = scan.nextInt();
        String numbers=""+name;
        String reverse="";
        for (int i = numbers.length()-1; i >=0 ; i--) {
            reverse+=numbers.charAt(i);

        }
        if (numbers.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }


    }



}
