package day43.emplooyeTask;

public class Tester extends Employee {



    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
    System.out.println(getName()+"is testing the application");
   }
public void sleep(){
    System.out.println(getName()+"sleep 8 hours");
   }
public void bugReport(){
    System.out.println(getName()+"is creating bug report");
   }
  }
