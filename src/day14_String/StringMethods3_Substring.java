package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {
        //substring (beginning index , ending index)
        String word = "cydeo school";
        // index number always start with 012345....
        String word1 = word.substring(0, 4 + 1);
        System.out.println(word1);

        String str1 = word.substring(6);
        System.out.println(str1);
        System.out.println("------------------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.lastIndexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------------------------");

        String word3 = "Python C# Ruby";
        String z1 = word3.substring(0, word3.indexOf(" "));
        String z2 = word3.substring(word3.indexOf(" ") + 1, word3.lastIndexOf(" "));
        String z3 = word3.substring(word3.lastIndexOf(" ") + 1);

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);

        System.out.println("-----------------------------------");
        String word4 = "akile altın #C";
        String a1 = word4.substring(0, word4.indexOf(" "));
        String a2 = word4.substring(word4.indexOf(" ") + 1, word4.lastIndexOf(" "));
        String a3 = word4.substring(word4.lastIndexOf(" ") + 1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("------------------------------------------");
        String word5 = "Mom Dad Sister";
        String v1 = word5.substring(0, word5.indexOf(" "));
        String v2 = word5.substring(word5.indexOf(" ") + 1, word5.lastIndexOf(" "));
        String v3 = word5.substring(word5.lastIndexOf(" ") + 1);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("-----------------------");
        String pencil1 = "One Two Three";
        String c1 = pencil1.substring(0, pencil1.indexOf(" "));
        String c2 = pencil1.substring(pencil1.indexOf(" ") + 1, pencil1.lastIndexOf(" "));
        String c3 = pencil1.substring(pencil1.lastIndexOf(" ") + 1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }


}
