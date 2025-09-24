package controller;
import shapes.Circle;
import shapes.Square;
import shapes.Rectangle;
import shapes.Shape;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle(3.7);

        Rectangle r1 = new Rectangle(2.4,5.7);
        Rectangle r2 = new Rectangle(4.8,1.9);

        Square s1 = new Square(3.4);
        Square s2 = new Square(2.58);

        s1.draw();
        r2.draw();

        Shape[] shapes = new Shape [6];
        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = r1;
        shapes[3] = r2;
        shapes[4] = s1;
        shapes[5] = s2;

        for(Shape s:shapes) {

            s.draw();
            System.out.println("Volume is " + s.calculateVolume(s, 1.95));

        }
    }


}
