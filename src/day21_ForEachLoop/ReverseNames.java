package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names={"Nurcan Altin","Durcan Altin","Mustafa Altin","Akile Altin","Hacer Altin","Adem Cingoz",
                "Esra Altin","Rüya Altin","Yasemin Altin","Mehmet Altin"};
        for (String each : names) {//each:"Nurcan Altin","Durcan Altin","Mustafa Altin","Akile Altin",....
            String reversed ="";
            for (int i = each.length()-1; i>=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
