package Class15.Method_ovverriding.Task2;

public class Bird extends Animal {
    public void move(){
        super.move();
        System.out.println(getClass().getSimpleName()+"Birds are flying");
    }
}
