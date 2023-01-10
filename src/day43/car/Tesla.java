package day43.car;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super("tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("say\"start\"");
    }
    public final void autoPilot(){
        System.out.println(getBrand()+" "+"has auto pilot feature");

    }
}
