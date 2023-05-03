package lecture20232703;

public class Calculator {
    
    public static void main(String [] args) {
        Minus2Num m2n = new Minus2Num();
        m2n.setNums(2, 3);
        System.out.print(m2n.result());
    }
}

class Plus2Num {
    int num1, num2;

    void setNums(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    int result() {
        return num1 + num2;
    }
}

class Multiply2Num {
    int num1, num2;

    void setNums(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    int result() {
        return num1 * num2;
    }
}
