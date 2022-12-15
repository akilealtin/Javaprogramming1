package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] number ={1,2,3,4,5};
        System.out.println(number);//hashcode
        System.out.println(Arrays.toString(number));//{1,2,3,4,5};
/*
        String str="Java";
        System.out.println(str);
        System.out.println(str.toString());

 */
        System.out.println("-------------------------------------");
        int[]scores ={95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score:"+scores[0]);
        System.out.println("Max score:"+scores[scores.length-1]);


        String[] names={"Gunay","Anna","zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[]words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------------------");
        int[]arr1={1,3,2};
        int[]arr2={1,2,3};
        boolean r1=Arrays.equals(arr1,arr2);

        System.out.println(r1);
        Arrays.sort(arr1);//{1,2,3}
        Arrays.sort(arr2);//{1,2,3}
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("---------------------------------------------");
        //"acb","bac"
        char[]ch1={'a','b','c'};
        char[]ch2={'b','a','c'};
        Arrays.sort(ch1);//{a,b,c}
        Arrays.sort(ch2);//{a,b,b}
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram="+anagram);





    }
}
