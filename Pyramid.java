package geometryy;

public class Pyramid {
        final double baseLength = 5.0;
        final double baseWidth = 3.0;
        final double height = 7.0;

        //  Створення першого методу, логікою якого передбачено використання усіх змінних екземпляра класу оголошених як final.
        public void calculateVolume() {
            double volume = (baseLength * baseWidth * height) / 3;
            System.out.println("Об'єм піраміди: " + volume);
        }

        // Створення другого методу, логікою якого передбачено створення та використання локальних змінних оголошених як final.
        public void calculateSurfaceArea() {
            final double slantHeight = Math.sqrt(baseLength * baseLength + baseWidth * baseWidth + height * height);
            final double lateralArea = baseLength * slantHeight / 2 + baseWidth * slantHeight / 2;
            final double baseArea = baseLength * baseWidth;
            final double totalSurfaceArea = lateralArea + baseArea;

            System.out.println("Площа поверхні піраміди : " + totalSurfaceArea);
        }


    }


