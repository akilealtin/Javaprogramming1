package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str ="java is fun , ı love learning java";
        String str2=str.replace("java" , "python");// "python is fun , I love learning python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email="johnsmith@yahoo.com";
        email= email.replace("yahoo" , "gmail") ; // johnSmith@gmail.com
        System.out.println("email = " + email);//gmail
        
        String sentence = "java java Python python c# c# c++ c++ python python python python";
        String sentence2=sentence.replace("python", "");
        sentence2.replace("   "," ");
        System.out.println("sentence2 = " + sentence2);
        


        String s= "Dog Dog Dog Dog Dog Dog";
       s= s.replace("Dog" , "Cat"); // "cat..."
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2= s2.replace(" C#"," Java");
       // s2= s2.replace("C# is c" , "java is c"); // second method
        System.out.println("s2 = " + s2);

        String s3 = "java";
       s3= s3.replace("a" , "e") ;// "jeve"
        System.out.println("s3 = " + s3);
        
        System.out.println("---------------------------");
        
        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Python");

        System.out.println(result);


        String result2= "C# is fun , C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String result3= "java";
        result3=result3.replaceFirst("va", "vo"); // jov
        System.out.println(result3);






        
        
        




        
        





    }
}
