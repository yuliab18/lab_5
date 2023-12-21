package geometryy;

public class Rectangle  implements  Drawable{
 private double length;
 private double width;
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

    String color;
    public Rectangle(double length, double width, String color) {
        super();
        this.length = length;
        this.width = width;
        this.color = color;
    }
     private double area(){   //типізований метод
        double a;
        a = length * width;
        return a;
    }
    double areaDemo () { // механізм виклику інкапсульованого методу
        return area();
    }
    void Info(){
        System.out.println("Прямокутник з довжиною:" + length+  " шириною " + width+ " та кольором " + color);
    }
    // перевизначений метод
    int area(int length, int width) {
        int a = length * width;
        return a;
}
    @Override
    public void draw() {
        System.out.println("Drawing Rectangular");
    }
}


