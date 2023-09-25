package Project0;

public interface Shape {
    double area();
    double perimeter();
}
class Square implements Shape {

    private double length;
    private double height;

    public Square(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    public double area(){

        return length * height;
    }
    @Override
    public double perimeter(){

        return 2 * (length + height);
    }
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }
    @Override
    public double area() {

        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        double length = 5.0;
        double height = 5.0;
        Square r = new Square(length, height);

        System.out.println("square area = " + r.area());
        System.out.println("square perimeter = " + r.perimeter());

        double radius = 2.5;
        Circle c = new Circle(radius);
        System.out.println("circle area = " + c.area());
        System.out.println("circle perimeter = " + c.perimeter());

    }
}

