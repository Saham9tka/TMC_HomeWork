package Task2;

public class Triangle extends Figure {
    private final double A;
    private final double B;
    private final double C;
    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    @Override
    public double getPerimeter() {
        return this.A + this.B + this.C;
    }
    @Override
    public double getSquare() {
        double HalfPerimeter = getPerimeter() / 2;
        return Math.sqrt(HalfPerimeter * (HalfPerimeter - this.A) *
                (HalfPerimeter - this.B) * (HalfPerimeter - this.C));
    }
    @Override
    public String toString() {
        return "figure is Triangle" + "\nIts sides are equal: "+
                "\nSide A =" + this.A + "\nSide B =" + this.B + "\nSide C =" + this.C +
                "\nIts perimeter is: " + getPerimeter() + "\nIts square is: " + getSquare();
    }
}