package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle() {

        this(0.0);

    }

    public Circle(double radius) {

        if(radius < 0) {

            System.out.println("Invalid Radius.");
            System.exit(0);

        }

        this.radius = radius;

    }

    public void draw() {

        System.out.println("Drawing a Circle with a Radius.");

    }

    public double calculateArea() {

        return Math.PI * radius * radius;

    }

}
