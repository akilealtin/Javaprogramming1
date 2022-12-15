package week413;

import java.time.LocalDate;

public class teacher {

    public String name,lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;


    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public teacher(String name, String lastName, char gender, LocalDate dateOfBirth, long id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        int currentYear=LocalDate.now().getYear();
        int yearOfDateOfBirth=dateOfBirth.getYear();
        this.age=currentYear-yearOfDateOfBirth;




    }
}
/*

Task 1 :



     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object


 */