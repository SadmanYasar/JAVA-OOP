public class Lab5 {

    public static void main(String[] args) {
        ProductionStaff ps = new ProductionStaff("Adam", "A123",
                20, 16);
        System.out.println("Test printInfo() method:\n");
        ps.printInfo();
        System.out.println();
        System.out.println("Test printSlip() method:\n");
        ps.printSlip();
    }
}

abstract class Employee {
    protected String name;
    protected String icNo;

    public Employee(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }

    public abstract void printInfo();

    public abstract void printSlip();

}

interface HourlyJob {
    double PART_TIME_RATE = 6.5;
    double OVERTIME_RATE = 18.8;

    double calculateWage();
}

interface DailyJob {
    double RATE = 12.5;

    double calculateSalary();
}

class ProductionStaff extends Employee implements HourlyJob, DailyJob {
    private int workDays;
    private int overtimeHours;

    public ProductionStaff(String name, String icNo, int workDays, int overtimeHours) {
        super(name, icNo);
        this.workDays = workDays;
        this.overtimeHours = overtimeHours;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("IC No.: " + icNo);
    }

    public void printSlip() {
        double wage = calculateWage();
        double salary = calculateSalary();
        System.out.println("PRODUCTION STAFF SALARY SLIP ");

        printInfo();

        System.out.println("Working Days & Rate: " + workDays + " x RM " + RATE);
        System.out.println("Overtime Hours & Rate: " + overtimeHours + " x RM " + OVERTIME_RATE);
        System.out.println("Total Salary: RM " + (wage + salary));
    }

    public double calculateWage() {
        return this.overtimeHours * OVERTIME_RATE;
    }

    public double calculateSalary() {
        return this.workDays * RATE;
    }
}