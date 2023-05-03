public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Test Student Class\n\n");
        Student s1 = new Student("Ahmad", 72);
        Student s2 = new Student("John", 63);
        Student s3 = new Student("Kim", 81);
        System.out.println("Student marks:");
        System.out.println(s1.getName() + " - " + s1.getMark());
        System.out.println(s2.getName() + " - " + s2.getMark());
        System.out.println(s3.getName() + " - " + s3.getMark());
    }
}

class Student {
    private String name;
    private int mark;

    public Student(String n, int m) {
        name = n;
        mark = m;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMark(int m) {
        mark = m;
    }

    public int getMark() {
        return mark;
    }
}