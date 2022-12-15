package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence="This is a good day to learn java";

        String[]words=sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String reverseSentence="";//java learn to day good a is today
        for (int i = words.length-1; i >=0 ; i--) {
            reverseSentence+=words[i]+" ";
        }
        System.out.println(reverseSentence);
    }
}
