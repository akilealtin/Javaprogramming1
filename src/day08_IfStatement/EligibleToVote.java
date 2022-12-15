package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; //True

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }
          int score=60;
        if (60>=60){
            System.out.println("Congratulation you passed exam!");


            int result=-1;
            if(result>0){
                System.out.println("positive");
            } else if (result <0) {
                System.out.println("Negative");
            }else{
                System.out.println("Negative");

        }




            //System.out.println("you passed exam");
            //System.out.println("you failed");


        }

    }
}
