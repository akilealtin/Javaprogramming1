package day40_finalKeyword;

public class FinalVariable {

    final String birthday;
     final static String name;

    static {
        name="Batch 25";

    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;

    }

    public static void main(String[] args) {
        final double pi=3.14;
        //pi=4.14; final variable can not reassigned
        //pi =5.4;
        final String name;
        name="java";
       // name="wooden spoon";
        System.out.println(name);

        System.out.println("------------------");
        FinalVariable obj=new FinalVariable("may/01");
       // obj.birthday="june/01"; final variables can not be reassigned
        System.out.println(obj.birthday);

        System.out.println("---------------------------------------------");
      //  FinalVariable.name ="python"; // if before string final you can not change but if we use only string we can change the name
        System.out.println(FinalVariable.name);
    }
}
