package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {//runs first before anything, and only runs one time
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("static Block 2");
    }
    static {
        System.out.println("static Block 3");
    }
}
