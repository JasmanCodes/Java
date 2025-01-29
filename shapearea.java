public class ShapeArea {
    
    public static double area(double length, double width) {
        return length * width;
    }
    
    public static double area(double side) {
        return side * side;
    }
    
    public static double area(float radius) {
        return 3.14159 * radius * radius;
    }
    
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        System.out.println("Area of Rectangle: " + area(5, 10));
        System.out.println("Area of Square: " + area(4));
        System.out.println("Area of Circle: " + area(3.5f));
        System.out.println("Area of Triangle: " + area(6, 8, true));
    }
}
