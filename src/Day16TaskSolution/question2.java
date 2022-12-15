package Day16TaskSolution;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        System.out.println("Enter your character");
        char ch = scan.next().charAt(0);
        scan.close();
        int amountOfCharacter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                amountOfCharacter++;
            }
        }
        System.out.println(amountOfCharacter);


    }
}


/*
 Write a program that asks user to entare string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */

