package geometryy;

    public abstract class AbstractFigure extends Figure {
        abstract double area();
    }

 class FigureAbstr {
    class Rectangular extends AbstractFigure {
        private double length;
        private double width;

        public Rectangular(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }

    }

    }





