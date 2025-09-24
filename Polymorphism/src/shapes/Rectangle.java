package shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {

        this(0.0,0.0);

    }

    public Rectangle(double length, double width) {

        super();
        this.length = length;
        this.width = width;

    }

    public void draw() {

        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);

    }

    public double calculateArea() {

        return length * width;

    }

}
