package Class15.Method_ovverriding.Task1;

public class Bank {
    private int capital=10000;

    public int getCapital(){
       return capital;
    }
  public void calculateTheInterest(){
      System.out.println("Interest of the bank "+ getClass().getSimpleName());
  }
}
