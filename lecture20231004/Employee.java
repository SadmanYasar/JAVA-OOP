package lecture20231004;

public class Employee {
    private int empnum;
    private String empname;

    public Employee() {
        System.out.println(("Employee Created"));
    }

    public void setEmpNum(int empnum) {
        this.empnum = empnum;
    }

    public int getEmpNum() {
        return empnum;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public String getEmpName() {
        return empname;
    }

    public static void main(String[] args) {
        System.out.println("Test mymath class");

    }
}