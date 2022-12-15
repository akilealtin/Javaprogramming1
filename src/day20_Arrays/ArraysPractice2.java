package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];

        /*
        letters[0]='A';
        letters[1]='B';
        letter[2]='C';

         */
/*
        for (char i = 'A', j=0; i <='Z'&&j<letters.length ; i++ ,j++) {//index numbers 0-last index

            letters[j]=i;

        }

       */
        char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]= ch;
        }
        System.out.println(Arrays.toString(letters));//[A-Z]

        System.out.println("-----------------------------------------");
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i]);
        }








    }
}
