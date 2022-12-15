package day23_CustomMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("---------------------------------------------");
        HelloCydeo5Times();
        System.out.println("-----------------------------------------------");
        evenNumbers();
    }

    //create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    //create a function that can print hello cydeo 5 times ==>HelloCydeo5Times
    public static void HelloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    // create a function that can print all the even numbers from 1-10==>evenNumbers
    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }
    }


}
