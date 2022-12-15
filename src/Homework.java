import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        one();

    }
    public static void one(){
        String[][] fruits=new String[3][];

        String[]fruit={"apple","banana","pear"};
        String[]price={"10","12","13"};
        String[]count={"100","190","200"};

       /* fruit[0]=fruit;
        fruit[1]=price;
        fruit[2]=count;

        */
        System.out.println(Arrays.deepToString(fruits));
        for (int i = 0; i < 3; i++) {
            String name=fruits[0][i];

        }

    }
}
