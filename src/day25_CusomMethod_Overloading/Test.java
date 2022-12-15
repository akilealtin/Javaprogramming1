package day25_CusomMethod_Overloading;


import Utilities.StringUtilities;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtilities.printEachChar(str);
        System.out.println("--------------------------------------");

        String str1="Cydeo school";
        String reverse=StringUtilities.reverse(str1);
        System.out.println(reverse);

        System.out.println("---------------------------------------------");
        String word="java";
        boolean palindrome =StringUtilities.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("-----------------------------------------");
        String[]names={"Anna","java","python","racecar","mom","cydeo"};
        int count=0;
        for (String each:names){
            if (StringUtilities.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);
        System.out.println("---------------------------------");
        String s2="aaaaabbbbbccccddddd";
       String nonDup= StringUtilities.removeDuplicate(s2);
        System.out.println(nonDup);


    }

}






