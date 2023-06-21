package aggregation_composition_practice;

import java.util.Scanner;

public class TestPersonStudent {
    public static void main(String[] args) {
        System.out.println("Test Person & Student");

        Scanner scn = new Scanner(System.in);

        // This will call both the constructors of
        // Person and Student classes (lines 31 & 55)
        Student s = new Student("Adam", "123", "S456");

        System.out.println("STUDENT INFO");
        s.printInfo();

    }
}

class Person {
    private String name;
    protected String icNo;

    public Person() {

    }

    public Person(String n) {
        this(n, "000");
    }

    public Person(String n, String icn) {
        name = n;
        icNo = icn;
    }

    public void keyinInfo(Scanner s) {
        System.out.print("Name: ");
        name = s.nextLine();

        System.out.print("IC No.: ");
        icNo = s.nextLine();
    }

    public void printInfo() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("IC No.: %s\n", icNo);
    }

}

class Student extends Person {
    private String matricNo;

    public Student(String n, String icn, String mn) {
        // Call the base class constructor line 31
        super(n, icn);

        matricNo = mn;
    }

    public void keyinInfo(Scanner s) {
        super.keyinInfo(s);
        System.out.print("Matric No.: ");
        matricNo = s.nextLine();
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("Matric No.: %s\n", matricNo);
    }
}