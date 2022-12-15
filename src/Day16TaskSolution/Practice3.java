package Day16TaskSolution;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        String sentence = "Java Java";
        int amountOfJava = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            String str = sentence.substring(i, i + 4);
            if (str.equalsIgnoreCase("java")) {
                amountOfJava++;
            }
        }
        System.out.println(amountOfJava);



    }
}



/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */