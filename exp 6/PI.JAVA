import java.util.Scanner;

class MathConstants {
    final double PI = 3.14;

    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

public class PI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        circle.displayPI();
        circle.calculateArea(radius);

        scanner.close();
    }
}
