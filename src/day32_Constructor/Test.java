package day32_Constructor;

public class Test {
    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        this();
        System.out.println("B");
    }
    public Test(double a){
        this(10);
        System.out.println("C");
    }
    public Test(String str){// A B C D
        this(2.5);
        System.out.println("D");

    }

    public static void main(String[] args) {
        new Test("Java");

    }
}
