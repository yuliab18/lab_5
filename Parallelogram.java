package geometryy;

public class Parallelogram {
        static int side1 = 5;
        static int side2;

        static {
            // статичний блок ініціалізації
            side2 = 10;
        }

        public static double calculatePerimeter() {
            // Логіка методу, яка визначає периметр паралелограма
            return 2 * (side1 + side2);
        }

        public static double calculateArea() {
            // Логіка методу, яка визначає площу паралелограма
            return side1 * side2;
        }


    }


