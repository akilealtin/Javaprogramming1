package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aabbaacc";
        //          0123456
        String result="";//abc
                     //i <=7====>i <8
        for (int i = 0; i <=str.length()-1; i++) {//i: represent all the index numbers of str start from the 0
           String ch =""+str.charAt(i);
            if (!result.contains(ch)){
                result+=ch;//the character will be added to the result
            }

        }
        System.out.println(result);

    }
}
