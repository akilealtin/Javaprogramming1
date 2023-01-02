package day40_finalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog =new Dog("max","Husky",'M',"white","Large",4);
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
    }
}
