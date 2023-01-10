package day43.car;

public class Honda extends Car {
    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void start(){
      System.out.println("twist the key to ignition");
  }
 }
