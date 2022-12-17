package Class15.Method_ovverriding.Task2;

public class Cow extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("Cow are walking");
    }
}
