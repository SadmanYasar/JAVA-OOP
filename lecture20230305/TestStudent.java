// Name: Sadman Yasar Sayem
// Matric: A21EC3052

// Name: Amyzal Muhammad Zikrullah Bin Yahya
// Matric: A21EC8004

public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Test Student Class\n\n");

        String[][] data = {
                { "John", "85" },
                { "Sarah", "92" },
                { "Michael", "78" },
                { "Emma", "95" },
                { "David", "88" },
                { "Olivia", "90" },
                { "James", "82" },
                { "Sophia", "87" },
                { "William", "91" },
                { "Isabella", "89" }
        };

        Student[] students = new Student[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                String name = data[i][0];
                int mark = Integer.parseInt(data[i][1]);

                students[i] = new Student(name, mark);
            }
        }

        System.out.println("Student marks:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " - " + students[i].getMark());
        }
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