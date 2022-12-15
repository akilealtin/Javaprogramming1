package week413;

public class task1 {
    public static void main(String[] args) {
        spaces(" this is java office hours");
        investment(2000.0,0.12,5);
        leap(1995);
    }
    public static void spaces(String str){

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                count+=1;
            }
        }
        System.out.println("total amount is = "+count);

        }

        public static void investment(double amount,double rate,int year){
            for (int i = 0; i < year; i++) {
                amount+=amount+amount*rate;
            }
            System.out.println("amount = " + amount);
        //amount =amount+amount*rate
            // //amount =amount+amount*rate
        }
    public static boolean leap(int year) {
        //year should be divisible by 4
        //year can not only divisible by 100
        //year should be divisible by100 and 400 at the same time


        boolean leap=false;
        if (year%4==0){
            leap=true;
        }else {
            leap=false;
        }
        return leap;

    }



}
/*
task1:
write a java method , count all the space in given string, then print the number of space
"this is java office hour"-->5
 task2:
 write a java method to calculate total money in your bank account
     method receives 3 arguments: original amount, rate, year.
     task3:
// 4. write a java method, check given year is leap year or not.


 */