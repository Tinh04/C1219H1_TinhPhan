package B4_Inheritances.Practices.ShapeObject;

public class Square extends Rectangle {
    private double side = 1.0;

    public Square() {
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    public double getLength() {
        return side;
    }

    @Override
    public String toString() {
        return "A Square with side = " + side +
                " , which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);
    }
}
