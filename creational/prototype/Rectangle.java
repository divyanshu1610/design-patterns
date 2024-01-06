package creational.prototype;

public class Rectangle extends Shape {

    public Rectangle(Rectangle source) {
        super(source);
    }
    
    public Rectangle() {
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {

        return super.toString() + " Rectangle []";
    }
    
}
