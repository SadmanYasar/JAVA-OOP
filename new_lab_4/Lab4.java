import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        ArrayList<Employee> eList = new ArrayList<Employee>();

        Scanner scan = new Scanner(System.in);

        Boolean exit = false;
        int menu;

        while (!exit) {

            menu = getMenu(scan);
           
            if (menu == 1) {
                System.out.println("\nADD EMPLOYEE");
                System.out.println("---------------");
                eList.add(addEmploye(scan));

            } else if (menu == 2) {
                System.out.println("\nEMPLOYEE LIST");
                System.out.println("---------------");
                for (int i = 0; i < eList.size(); i++) {
                    Employee e = eList.get(i);
                    System.out.println(i + 1 + ". " + e.getEmpName() + " - " + e.getEmpNum());
                }

                System.out.println("---------------\n");

            } else if (menu == 3) {
                System.out.println("\nDELETE EMPLOYEE");
                System.out.println("---------------");
                System.out.print("Enter employee list num.: ");
                int listNum = Integer.parseInt(scan.nextLine());

                eList.remove(listNum - 1);

            } else if (menu == 4) {
                exit = true;
            }
            

        }

        //eList.add(new Employee(empName, empNum));
    }

    public static Employee addEmploye(Scanner scn) {
        System.out.print("Employee name: ");
        String empName = scn.nextLine();

        System.out.print("Employee Num.: ");
        int empNum = Integer.parseInt(scn.nextLine());
        
        Employee emp = new Employee(empName, empNum);
        return emp;
    }

    public static int getMenu(Scanner scn) {
        System.out.println("1. Add employe");
        System.out.println("2. List employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scn.nextLine());
    }
}

class Employee {
    private int empNum;
    private String empName;

    public Employee(int num, String name) {
        empNum = num;
        empName = name;
    }

    public Employee(String name, int num) { // overload constructor
        System.out.println("Instantiate Employee with arguments");
        empNum = num;
        empName = name;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getEmpName() {
        return empName;
    }
}