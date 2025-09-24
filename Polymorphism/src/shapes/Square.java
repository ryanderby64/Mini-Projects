package shapes;

public class Square extends Shape {

    private double side;

    public Square() {

        this(0.0);

    }

    public Square(double side) {

        super();
        this.side = side;

    }

    public void draw() {

        System.out.println("Drawing a Square with side length " + side + ".");

    }

    public double calculateArea() {

        return side * side;

    }
}
