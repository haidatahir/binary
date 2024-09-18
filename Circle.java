package geometry;

public class Circle implements Drawable, Movable {
    double pi = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Circle has been moved to x = " + x + " and y = " + y);
    }
}