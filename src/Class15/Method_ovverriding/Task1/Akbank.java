package Class15.Method_ovverriding.Task1;

public class Akbank extends Bank{
    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital()*7/100);

    }
}
