package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
      Car car1 = new Car();
      car1.setInfo("Toyota","Camry","white",2021,35000);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("BMV","33Lis","Black",2020,4500);
        System.out.println(car2);
        Car car3=new Car();
        car3.setInfo("Audi","Q7","red",2019,40000);
        System.out.println(car3);

       // Car[]cars={car1,car2,car3};
        ArrayList<Car> carLists=new ArrayList<>();
        carLists.addAll(Arrays.asList(car1,car2,car3));
        for (Car each:carLists){
            System.out.println(each.brand+":"+each.price);

        }
        System.out.println("-------------------------------------------------------------------");

        /*
        BMW:2005-2008
        toyota :1995 -1997
         */
        carLists.removeIf(p->p.brand.equals("BMW")&& p.year >=2005 && p.year >=2008);
        carLists.removeIf(p->p.brand.equals("Toyota") && p.year >=1995 && p.year <= 1997);
    }



}
