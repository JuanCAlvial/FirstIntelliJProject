package Class29GroupProject;

public interface Shape {
    /*
       1. Create an Interface 'Shape' with undefined methods as calculate Area and calculate Perimiter .
          Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
          Test your code
     */
    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;


    }
    @Override
    public void calculateArea() {
        System.out.println(Math.PI*radius*radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*Math.PI*radius);
    }
}
class Square implements Shape{
    double length;
    Square(double length){
        this.length=length;
    }

    @Override
    public void calculateArea() {
        System.out.println(length*length);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println((length*4));
    }
}
class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(15);
        circle.calculateArea();
        circle.calculatePerimeter();

        Shape shape1 = new Square(20);
        shape1.calculateArea();
        shape1.calculatePerimeter();
    }
}

