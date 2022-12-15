package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345School!@#$%WoodenSpoon";
        String digit ="";//12345
        String letters="";//cydeoWoodenSpoon
        String specialChars="";//!@#$%

        for (int i = 0; i< str.length(); i++) {//i:index numbers of str (0-last index)
            char ch=str.charAt(i);//ch:each character that we have in str
           if (ch>='0'&& ch<='9'){//if the character is between '0' to '9' than ıts digit
               digit+=ch;
           } else if (ch>='A'&& ch  <='Z') {//if the character is between a to z than ıts letter
               letters+=ch;

           } else if (ch >='a' && ch <='z') {
               letters+=ch;

           }else {//if the character ,s neither digit nor letter than its special character
               if (ch !=' '){
                   specialChars+=ch;
               }

           }
        }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }
}
