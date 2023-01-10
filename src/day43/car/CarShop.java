package day43.car;

public class CarShop {
    public static void main(String[] args) {
    //    Car car1 = new Car("cydeo","25","Blue","2023",100000);
// we can not create object from Abstract class, because abstract class is not concrete
        Honda honda=new Honda("Accord","Black","Black",2019,30000);
        Audi audi=new Audi("Q7","White",2023,60000);
        Tesla tesla=new Tesla("model13","white",2023,70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("-------------------------------------------------");
        honda.setColor("Red");
        audi.setColor("pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(260000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }
}
