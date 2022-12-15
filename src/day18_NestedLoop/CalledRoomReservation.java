package day18_NestedLoop;

import java.util.Scanner;

public class CalledRoomReservation {
    public static void main(String[] args) {

        String another = "";
        int total = 0;
        int king = 120, queen = 100, single = 80;

        System.out.println("King Bed   ==> $120\nQueen Bed  ==> $100\nSingle Bed ==> $80");
        System.out.println("Which Bedroom do you want to reserve? (king/queen/single)");
        String bed = new Scanner(System.in).nextLine();

        while( !(bed.equalsIgnoreCase("king") || bed.equalsIgnoreCase("queen") || bed.equalsIgnoreCase("single")) ){

            System.out.println("Invalid. Please re-enter.");
            bed = new Scanner(System.in).nextLine();

        }

        if(bed.equalsIgnoreCase("king")){
            total = king;
        } else if (bed.equalsIgnoreCase("queen")) {
            total = queen;
        }else{
            total = single;
        }

        do {
            System.out.println("Would you like to reserve another room? (yes/no)");
            another = new Scanner(System.in).nextLine();

            while (!(another.equalsIgnoreCase("yes") || another.equalsIgnoreCase("no"))){

                System.out.println("Invalid. Please re-enter.");
                another = new Scanner(System.in).nextLine();

            }

            if(another.equalsIgnoreCase("no")){
                break;
            }

            System.out.println("Which Bedroom do you want to reserve? (king/queen/single)");
            bed = new Scanner(System.in).nextLine();

            if(bed.equalsIgnoreCase("king")){
                total += king;
            } else if (bed.equalsIgnoreCase("queen")) {
                total += queen;
            }else{
                total += single;
            }

        }while(another.equalsIgnoreCase("yes"));

        System.out.println("Your total is: $" + total);
    }
}
/*
2. Create a class called RoomReservation, write a program for the room
        reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$
        the program asks the user which bedroom does he/she wants to
        reserve, and how many nights he/she is staying.
        Then Ask the user "would you like to reserve another room?""
        if yes ==> repeat the entire steps
        if no ==> return the  total price
        If user enters any invalid entry,  ask the user to re-
        enter until user provides a valid entry

 */