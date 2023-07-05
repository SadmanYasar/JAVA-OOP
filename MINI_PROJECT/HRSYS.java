
// HRSYS.java
// Team members:
// 1. Sadman Yasar Sayem (A21EC3052)
// 2. ???
// 3. ???
// 4. ???
import java.util.*;

public class HRSYS {
    // ArrayList variables to store all new created Company and
    // Employee (Staff/ContractStaff) instances
    public static ArrayList<Company> companies = new ArrayList<Company>();
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {

        // Test case to quickly add company, department, and staff
        // Company com = new Company("Farmfresh");
        // companies.add(com);
        // companies.get(0).addDepartment("Admin");

        // Employee staff = new ContractStaff("AZMI", "A123", "CEO", 6);
        // staff.setDepartment(companies.get(0).getDepartments().get(0));
        // employees.add(staff);
        // End test case

        Scanner keyin = new Scanner(System.in);

        boolean exit = false;
        int operation = 0;

        while (!exit) {
            System.out.println();
            System.out.println("1. Add Company");
            System.out.println("2. Add Department");
            System.out.println("3. Add Staff");
            System.out.println("4. List Staff");
            System.out.println("5. Exit");

            while (operation < 1 || operation > 5) {
                System.out.print("Choose operation (1-5): ");
                operation = Integer.parseInt(keyin.nextLine());
            }

            if (operation == 1)
                addCompany(keyin);

            else if (operation == 2)
                addDepartment(keyin);

            else if (operation == 3)
                addStaff(keyin);

            else if (operation == 4)
                listStaff(keyin);

            else if (operation == 5)
                exit = true;

            operation = 0;
        }
    }

    public static void addCompany(Scanner keyin) {
        pressEnter(keyin);
    }

    public static void addDepartment(Scanner keyin) {
        pressEnter(keyin);
    }

    public static void addStaff(Scanner keyin) {
        pressEnter(keyin);
    }

    public static void listStaff(Scanner keyin) {
        pressEnter(keyin);
    }

    public static void pressEnter(Scanner keyin) {
        System.out.print("\nPress enter to continue... ");
        keyin.nextLine();
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments = new ArrayList<Department>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
}

class Department {
    private String name;
    private Company company;
    private ArrayList<Employee> staffs = new ArrayList<Employee>();

    public Department(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }
}

// abstract class employee
abstract class Employee {
    private String name;
    private String id;
    private String position;
    private Department department;

    public Employee(String name, String id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }
}

// class staff
class Staff extends Employee {
    public Staff(String name, String id, String position) {
        super(name, id, position);
    }
}

// class contract staff
class ContractStaff extends Staff {
    private int contractPeriod;

    public ContractStaff(String name, String id, String position, int contractPeriod) {
        super(name, id, position);
        this.contractPeriod = contractPeriod;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }
}