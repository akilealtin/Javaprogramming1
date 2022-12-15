package day31_Constructors;

public class person {
    public String name;
    public char gender;
    public int age;


    public person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
