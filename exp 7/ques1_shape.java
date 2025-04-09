
abstract class shape{
    abstract void calculatearea();
}

class Rectangle extends shape{
    private double length, breadth;

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    void calculatearea(){
        double area= length*breadth;
        System.out.println("Area= "+area);
    }
}


class Circle extends shape{
    private double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
    void calculatearea(){
        double area= 3.14*radius*radius;
        System.out.println("Area= "+area);
    }
}

public class ques1_shape{
    public static void main(String[] args) {
        shape Rectangle=new Rectangle(14.2,12.1);
        shape Circle=new Circle(6.34);

        Rectangle.calculatearea();
        Circle.calculatearea();
    }
}
