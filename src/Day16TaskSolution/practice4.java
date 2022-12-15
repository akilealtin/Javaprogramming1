package Day16TaskSolution;

public class practice4 {
    public static void main(String[] args) {
        String sentence="caT dog dogG cAt";
        int numberOfCat=0;
        int numberOfDog=0;
        for (int i=0;i<=sentence.length()-3;i++){
            String str1=sentence.substring(i,i+3);
            if (str1.equalsIgnoreCase("dog")){
                numberOfDog++;
            }else if (str1.equalsIgnoreCase("cat")){
                numberOfCat++;
            }
        }boolean isTheSameNumber=(numberOfDog==numberOfCat);
        System.out.println(isTheSameNumber);
    }
}




/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */


/*
  String sentence="caT dog dogG cAt ";
        int numberOfCat=0;
        int numberOfDog=0;
        for (int i=0;i<=sentence.length()-3;i++){
            String str1=sentence.substring(i,i+3);
            if (str1.equalsIgnoreCase("dog")){
                numberOfDog++;
            }else if (str1.equalsIgnoreCase("cat")){
                numberOfCat++;
            }
        }boolean isTheSameNumber=(numberOfDog==numberOfCat);
        System.out.println(isTheSameNumber);
    }
}
 */
