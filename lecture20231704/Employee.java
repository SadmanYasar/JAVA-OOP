public class Employee {
    private int empNum;
    private String empName;

    public final static int WORKING_DAYS = 5;

    public Employee() {
        System.out.println("Instantiate Employee without arguments");
    }

    public Employee(int num, String name) { // overload constructor
        System.out.println("Instantiate Employee with arguments");
        empNum = num;
        empName = name;
    }

    public Employee(String name, int num) { // overload constructor
        System.out.println("Instantiate Employee with arguments");
        empNum = num;
        empName = name;
    }

    public Employee(Employee e) {
        empNum = e.empNum;
        empName = e.empName;
    }

    public void setEmpNum(int num) {
        empNum = num;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    public static String restDaysInfo() {
        return "Saturday & Sunday";
    }

    public boolean equals(Employee e) {
        if (this.empName == e.empName && this.empNum == e.empNum) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Num.: " + empNum + "\n");
    }

}