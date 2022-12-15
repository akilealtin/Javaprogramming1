package week413;

public class CustomMethods {
    public static void main(String[] args) {
manualTesting("ahmet");
manualTesting("adem","google");


    }
    public static void manualTesting(String name,String ProjectName){
        System.out.println(name+ "this is for manual testing?");
    }
    public static void manualTesting(String name,String ProjectName,int time){
        System.out.println(name+ "this is for manual testing?");
    }
    public static void webTesting(){
        System.out.println("this is for web testing?");
    }

    public static void manualTesting(String name){
        System.out.println(name+ "this is for manual testing?");
    }
    public static void apiTesting(){
        System.out.println("this is for api testing?");
    }
    public static void dataTesting(){
        System.out.println("this is for data testing?");
    }
}
