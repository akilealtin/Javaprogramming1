package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");//java programming enter
        String FullName = scan.nextLine();

        System.out.println("Enter your Building number");//7925A
        String buildingNumber = scan.next();
        scan.nextLine();

        System.out.println("Enter your Street Name");
        String streetName = scan.nextLine();//jones bons driver enter

        System.out.println("Enter your city name");
        String cityName= scan.nextLine(); //mclean city enter

        System.out.println("Enter your state ");
        String state = scan.next(); // va

        System.out.println("Enter your zip code");
        String zipCode = scan.next(); //22012
        scan.nextLine();



        scan.close();











    }

}

/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */