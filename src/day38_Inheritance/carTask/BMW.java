package day38_Inheritance.carTask;

public class BMW extends Car {
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+"breaks down every 100 miles");
    }
    public void racing(){
        System.out.println(brand+" "+model+"is racing a car");
    }
    public void start(){
        System.out.println("call mechanic to jump start"+brand+" "+model);
    }
}
/*
 BMW
              extra methods:
              breakdown()
              racing()
 */
