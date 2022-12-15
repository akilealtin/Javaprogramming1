package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName="cyDeo",
               lastname="SCHOOL";
       firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                  //c         +                    ydeo ==>   "Cydeo"
        //firtsName=(""+firstName.chatAt(0)).toupperCase() + firstName.substring(1).toLowerCase();
        lastname= lastname.substring(0, 1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastname);
        String fullName = firstName+ " " + lastname;
        System.out.println("fullName= " + fullName);

    }
}
