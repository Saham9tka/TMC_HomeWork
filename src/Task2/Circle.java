package Task2;

public class Circle extends Figure {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public String toString() {
        return String.format("Your figure is a Circle" + "\nRadius = %.2f" + "\nPerimeter (Circumference) = %.2f" +
                        "\nArea = %.2f",
                this.radius, getPerimeter(), getSquare());
}}