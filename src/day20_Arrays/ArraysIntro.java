package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that is capable enough to contain 5 names
       String[] myGroup=new String[5];//it can only contain 5 person//0-4
       myGroup[0]="Gunay";
       myGroup[1]="Neira";
       myGroup[2]="Hulya";
       myGroup[3]="Suat" ;
       myGroup[4]= "mikael";

       // myGroup[5]="Muhtar";
        //myGroup[-1]="Adam";

    // System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));//["Gunay", "Neira" ,"Hulya", "mikael","suat")

        System.out.println("-------------------------------------------------");
        String[]days={"Monday","Tuesday","wednesday","Thursday","Friday","Saturday","sunday"};
        //index:        0         1         2          3          4         5          6

        System.out.println(Arrays.toString(days));
        int number=1;
        if (number<1||number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }
}
