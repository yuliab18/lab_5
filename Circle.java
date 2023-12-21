package geometryy;

public class Circle {
  private double radius;
double xx;
double yy;

    public Circle(int radius) {
    }

    public double getRadius() {
        return radius;
    }
    public void setCircle(double radius) {
        this.radius = radius;
    }

public Circle(double radius, double xx, double yy){
    super();
    this.radius=radius;
    this.xx=xx;
    this.yy=yy;
}

 double area(){   //типізований метод
    double a;
    a = radius * radius * Math.PI;
    return a;
 }
 void Info(){
    System.out.println("Коло з радіусом:" +radius+ " і центром в точці (" +xx+", "+yy+")");

 }
    // перевизначений метод
    int area(int radius) {
        int a = (int) (radius * radius * Math.PI);
        return a;
    }
    public void setRadius(double newRadius){
        if (newRadius > 0){
            this.radius = newRadius *2;
        }

}

    }



