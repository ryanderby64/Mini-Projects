package shapes;

public class Shape {

    public Shape() {


    }

    public void draw() {

        System.out.println("Drawing a shape!");

    }

    public double calculateArea() {

        return 0.0;

    }

    public double calculateVolume(Shape shape2d, double height) {

        return shape2d.calculateArea() * height;

    }

    public final void greetings() {

        System.out.println("Greetings with smile!");
    }


}
