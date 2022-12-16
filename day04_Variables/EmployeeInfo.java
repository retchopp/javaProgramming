package day04_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {

String name = "recep";
int age = 41;
char gender = 'M';
String company = "hertz";
String jobTitle = "boss";
double yearsOfExperience = 8.5;
int salary = 3000;
boolean isFullTime = true;
boolean isMarried = true;
String employeeId = "22394339182";
String sSN = "243423434";


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("sSN = " + sSN);

    }

    private static void getPrintln(String sSN) {
        System.out.println("sSN = " + sSN);
    }


}

/*
Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)

 */