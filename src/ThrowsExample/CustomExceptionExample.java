package ThrowsExample;

public class CustomExceptionExample {
    public static void main(String[] args) {
        //Arithmetic Exception

    try{
        System.out.println(3/0);
    }catch (Exception e){
       // throw new CustomArithmaticException();
        throw new CustomArithmeticException("you have error");
    }
    }
}
