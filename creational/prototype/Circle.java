package creational.prototype;

public class Circle extends Shape {

    private int radius;

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public Circle() {
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +  " Circle [radius=" + radius + "]";
    }
    
}
