package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Recep";
        String lastName = "Ozmen";
        int age = 41;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.80;

        String fullName = firstName + " " + lastName;

        //Full name of the person is --------- --------

        System.out.println("Full name of the person is " + firstName + " " + lastName);

        //---- is --- years old

        System.out.println(fullName + " is " + age + " years old");

        //fullName is jobTitle, work at companyName, and fullName's salary is salary

        System.out.println(fullName + " is " + jobTitle + ", " + "work at " + companyName + ", and " + fullName + " " + "salary is " + salary);






    }
}
