package Class15.Method_ovverriding.Task3;

public class Manager extends Employee {
    public int salary(){
        // ı am getting the base salary from parent class
        return super.salary()+20000;

    }

}
