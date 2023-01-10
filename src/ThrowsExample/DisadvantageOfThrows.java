package ThrowsExample;

public class DisadvantageOfThrows {
    public static void main(String[] args) throws InterruptedException {

        //windows:ctrl+alt+t
        waitfor(3);
        sleep(4);


    }
    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }
    public static void methodB(){
        sleep(4);
    }
    public static void waitfor(int seconds)throws InterruptedException{
        sleep(4);
    }


}
