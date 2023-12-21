package geometryy;


public class RightTriangle extends Triangle {
    private double hypotenuse;

    // Конструктор для класу RightTriangle
    public RightTriangle(double side1, double side2, double hypotenuse) {
        super(side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void Info() {
        System.out.println("Прямокутний трикутник з сторонами " + side1 + ", " + side2 + ", " + hypotenuse);
    }

    public double calculateArea() {
        return 0.5 * side1 * side2;
    }

    public void InfoAndArea() {
        Info();
        System.out.println("Площа прямокутного трикутника: " + calculateArea());
    }
    public class RightTriangleDemo {
        // Метод, що використовує члени зовнішнього класу
        public void displayInfoAndHypotenuse() {
            Info();
            System.out.println("Гіпотенуза прямокутного трикутника дорівнює: " + hypotenuse);
        }
    }

    // Метод для виклику методу вкладеного класу
    public void testRightTriangle() {
        RightTriangleDemo demo = new RightTriangleDemo();
        demo.displayInfoAndHypotenuse();
    }
}
