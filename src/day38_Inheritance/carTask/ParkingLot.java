package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota =new Toyota("Cambry","Cambry",2020,20000,"Gray",123456);

        Tesla tesla =new Tesla("model s","model s",2020,94990,"red",0);

        BMW bmw=new BMW("X5","X5",2020,67350,"black",12000);

toyota.start();
tesla.start();
bmw.start();

    }
}
