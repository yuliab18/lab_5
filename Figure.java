package geometryy;


public class Figure {
class  Rectangular extends Figure {
    private double length;
    private double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
    class Circular extends Figure {
        private double radius;
        Circular(double radius) {
            this.radius = radius;
        }
        final double square() {
            double s;
            s = Math.PI * Math.pow(radius, 2);
            return s;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    }











