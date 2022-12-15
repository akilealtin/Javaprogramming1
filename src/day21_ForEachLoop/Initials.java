package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] names={"Nurcan Altin","Durcan Altin","Mustafa Altin","Akile Altin","Hacer Altin","Adem Cingoz",
                "Esra Altin","Rüya Altin","Yasemin Altin","Mehmet Altin"};


        for (String each:names){
            String initial=each.charAt(0)+"."+each.charAt(  each.indexOf(" ")+1 );
            System.out.println(initial);
        }

    }
}
