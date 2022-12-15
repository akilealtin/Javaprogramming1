package day37_Inheritance.animalTask;

public class Animal {
   public String name,breed;
   public char gender;
   public int age;
   public String size;
   public String color;

   public Animal(String name, String breed, char gender, int age, String size, String color) {
      this.name = name;
      this.breed = breed;
      this.gender = gender;
      this.age = age;
      this.size = size;
      this.color = color;
   }
   public void eat(){
      System.out.println(name+" is eating");
   }

   public void drink(){
      System.out.println(name+ " is drinking");
   }

   public void  move(){
      System.out.println(name+ " is moving");
   }

   public void sleep(){
      System.out.println(name+ " is sleeping");
   }

   public String toString() {
      return "Animal{" +
              "name='" + name + '\'' +
              ", breed='" + breed + '\'' +
              ", gender=" + gender +
              ", age=" + age +
              ", size='" + size + '\'' +
              ", color='" + color + '\'' +
              '}';
   }

   public static class AnimalObject {
       public static void main(String[] args) {
           Dog dog1=new Dog("Alex","Husky",'M',1,"small","White");
           System.out.println(dog1);
           dog1.bark();
           //dog1.scratch();
           //dog1.sing();

           Cat cat1=new Cat("Love","Siamese",'F',3,"Small","Black");
           System.out.println(cat1);
           cat1.scratch();
           //  cat1.bark();
           //  cat1.sing();

           Parrot parrot1=new Parrot("King","Macaw",'F',4,"small","Red");
           System.out.println(parrot1);
           parrot1.sing();
           //  parrot1.bark();
           //  parrot1.scratch();



       }
   }
}
