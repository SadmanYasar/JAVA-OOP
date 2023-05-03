package lab2;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Test Vehicle Class\n");

        System.out.println("Build Vios:\n");
        Car c1 = new Car();
        c1.setModel("Vios");
        c1.setHorsePower(80);
        System.out.println(c1.getInfo());

        System.out.println("Build Persona:\n");
        Car c2 = new Car("Persona", 88);
        System.out.println(c2.getInfo());

        System.out.println("Interactively build a car:\n");
        CarFactory cf = new CarFactory();
        Car c3 = cf.buildCar();
        System.out.println(c3.getInfo());

        System.out.println("Modify the car to becomes Civic...\n");
        cf.modifyCar(c3, "Civic", 127);
        System.out.println(c3.getInfo());

    }
}

class Car {
    String model;
    int horsePower;

    Car() {
        model = "";
        horsePower = 0;
    }

    Car(String model, Integer horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    String getInfo() {
        return "Print Car Info: \n"
                + "---------------- \n"
                + "Model - " + model + "\n"
                + "Horse Power - " + horsePower + "\n";
    }
}

class CarFactory {
    Car buildCar() {
        Scanner keyin = new Scanner(System.in);

        System.out.print("Enter model: ");
        String model = keyin.nextLine();

        System.out.print("Enter Horse Power: ");
        int horsePower = Integer.parseInt(keyin.nextLine());
        keyin.close();

        // returning object/instance from method
        Car c = new Car(model, horsePower);

        return c;
    }

    void modifyCar(Car c, String model, Integer horsePower) {
        c.setModel(model);
        c.setHorsePower(horsePower);
    }
}