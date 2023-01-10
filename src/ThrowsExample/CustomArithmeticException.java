package ThrowsExample;

public class CustomArithmeticException extends RuntimeException{
    //for windowsAlt+insert

    public CustomArithmeticException(String you_have_error) {
        super("you have an error with divide with 0");
    }
}
