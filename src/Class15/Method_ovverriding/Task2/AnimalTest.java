package Class15.Method_ovverriding.Task2;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.move();

        System.out.println("---------");

        Cow cow=new Cow();
        cow.move();

        System.out.println("---------");

        Fish fish=new Fish();
        fish.move();
    }
}
