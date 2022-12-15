package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers ={10, 5, 4, 20, 1, 0};
        int max=numbers[0];//10
        for (int number : numbers) {
            if (number>max){
                max=number;
            }
        }
        


    }
}
/*
 int[] numbers ={10, 5, 4, 20, 1, 0};
        int max=numbers[0];//10
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i]>max){//dizide mevcut maxsimum sayıdan daha büyük bir öğe varsa
               max=numbers[i];//max değişkenine daha büyük bir sayı atama
           }

        }
        System.out.println(max);

 */