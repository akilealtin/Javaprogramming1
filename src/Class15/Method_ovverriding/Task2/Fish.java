package Class15.Method_ovverriding.Task2;

public class Fish extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("fishes are swimming");
    }
}
