package Class15.Method_ovverriding.Task1;

public class TestInterest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.calculateTheInterest();
        System.out.println("-----------------");

        Akbank akbank=new Akbank();
        akbank.calculateTheInterest();
        System.out.println("-------------------");

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateTheInterest();
        System.out.println("---------------------");
        INGBank ingBank=new INGBank();
        ingBank.calculateTheInterest();
    }
}
