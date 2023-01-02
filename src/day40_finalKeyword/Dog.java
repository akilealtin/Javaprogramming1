package day40_finalKeyword;

public class Dog extends Animal {


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    public void eat(){
        System.out.println(getName()+"is eating dog food");
    }
    /*
   public void drink(){//final method can not be overridden
        System.out.println(getName()+"is drinking beer");
    }

     */
    public void bark(){
        System.out.println(getName()+"do is barking");
    }
}
//eating dog food