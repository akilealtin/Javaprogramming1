package day32_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jopTitle;
    public double salary;


    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //this.name = name;
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jopTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



}

