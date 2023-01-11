package day43_Abstraction.emplooyeTask;

public class EmployeeObject {

    public static void main(String[] args) {

        Tester tester=new Tester("Akile",27,'F',1456,"SDET",50000);
        Developer developer=new Developer("Adem",30,'M',14,"Developer",50000);
        Teacher teacher=new Teacher("yavuz",21,'M',15,"WebDeveloper",60000);
        Driver driver=new Driver("Mustafa",57,'m',74,"Operator Driver",40000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------------------------");
        developer.work();
        developer.sleep();
       //developer.bugreport
        developer.unitTest();
        developer.eat();

        System.out.println("-----------------------------------------------");
        teacher.sleep();
        teacher.work();
        teacher.eat();

        System.out.println("---------------------------------");

        driver.sleep();
        driver.work();
        driver.eat();




    }
}
