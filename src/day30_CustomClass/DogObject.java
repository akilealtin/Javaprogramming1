package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.breed="husky";
        dog1.age=5;
        dog1.gender='f';
        dog1.size="small";
        dog1.color="White";

        Dog dog2=new Dog();
        dog2.name="ACE";
        dog2.breed="Husky";
        dog2.age=6;
        dog2.gender='M';
        dog2.size="Big";
        dog2.color="white & black";

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");




        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        Dog dog4=new Dog();
        dog4.setInfo("Bullet","Labrador",3,'M',"extra Large","yellow");

        Dog dog5=new Dog();
        dog5.setInfo("sully","Pit-pull",6,'M',"large","black");

        System.out.println("-------------------------------------------");
        Dog[]dogs={dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog>femaleDog=new ArrayList<>();
        ArrayList<Dog>maleDogs=new ArrayList<>();



    }

}
