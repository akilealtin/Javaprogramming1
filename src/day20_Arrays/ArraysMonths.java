package day20_Arrays;

public class ArraysMonths {
    public static void main(String[] args) {

       String[]months={"january","February","March","April","May","June","July","August","September","October",
               "November","December"};//0-11(length-1)

        /*
        System.out.println(months[0]);//jan
        System.out.println(months[1]);//feb
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

         */
        for (int i=0; i < months.length;i++){//i:represents the index numbers of array starting from 0
            System.out.println(months[i]);
        }

        System.out.println("-------------------------------------------------");
        for (int i = months.length-1 ; i >=0;i--) {//represents the index numbers of array starting last index
            System.out.println(months[i]);

        }



    }
}
