package geometryy;

public class Triangle {
    double side1;
    double side2;
    double side3;
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1= side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Перевизначений конструктор
    public Triangle(double i) {
        side1 = side2 = side3 = i;
    }

    // Перевизначений конструктор
    public Triangle(Triangle triangle) {
        this.side1 = triangle.side1;
        this.side2 = triangle.side2;

    }

    // Перевизначений конструктор,
    public Triangle() {
    }

    double area(){   //типізований метод
        double a;
        double s;
        s = (side1 + side2 + side3)/2;
        a = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return a;
    }
    void Info(){
        System.out.println("Трикутник зі сторонами:" +side1+", " +side2+" i " +side3);
    }
    // перевизначений метод
    int area(int side1, int side2, int side3) {
        int a;
        int s;
        s = (side1 + side2 + side3)/2;
        a = (int) (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
        return a;
    }
    boolean equals (Triangle f){
        if (f.side1 == side1 && f.side2 == side2 && f.side3 == side3) return true;
        else return false;}

    }
