package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Check_vs_Unchecked {
    public static void main(String[] args) {
        //unchecked exception:
        int a =10;
        int b =0;
        //System.out.println(a/b);
       // System.out.println("wooden spoon");

        char[]characters={'A','B','C'};
        //                 0,   1,   2
       // System.out.println(characters[99]);

      //  Student student =null;

      //  System.out.println(student.getName());

      final   String str="wooden spoon";

        //str=null;

        System.out.println(str.toUpperCase());

        String str2="";//object!==null

        System.out.println(str2.isEmpty());

        //checked Exception:

        System.out.println("hello");

       // Thread.sleep(3000); checked

        System.out.println("cydeo");

       // FileInputStream file=new FileInputStream("path of the file");

        System.out.println("java".charAt(20000));//unchecked exception

    }
}
