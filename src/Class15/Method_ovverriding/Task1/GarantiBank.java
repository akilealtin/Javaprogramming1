package Class15.Method_ovverriding.Task1;

public class GarantiBank extends Bank {
    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*8/100);
    }
}
