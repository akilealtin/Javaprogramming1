package Class15.Method_ovverriding.Task1;

public class INGBank extends Bank{
    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*9/100);
    }
}
