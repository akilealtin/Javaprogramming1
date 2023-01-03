package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {
        Employee employee=null;

        try {
            System.out.println(employee.getSalary());

        }catch (IndexOutOfBoundsException e){
            System.out.println("second catch block");
            e.printStackTrace();

        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("fourth catch block");
        }catch (RuntimeException e){
            System.out.println("fifth catch block");
            e.printStackTrace();
        }
        System.out.println("tested completed");

        System.out.println("-------------------------------------------");
        try {

            System.out.println("java".charAt(-1));
        }catch (RuntimeException e){
          e.printStackTrace();
        }
    }
}
