package ThrowsExample;

public class Throws {
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            //throw new

        }
    }
}
