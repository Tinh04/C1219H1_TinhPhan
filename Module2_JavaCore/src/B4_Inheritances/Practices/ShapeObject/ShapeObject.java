package B4_Inheritances.Practices.ShapeObject;

//Khai bao lop Shape
public class ShapeObject {
    //khai bao hai thuoc tinh
    String color = "green";
    Boolean filled = true;

    public ShapeObject() {
    }

    public ShapeObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape has color is " + getColor() + " and" +
                (getFilled() ? "filled" : " not filled");
    }

    public static void main(String[] args) {
        ShapeObject shape = new ShapeObject();
        System.out.println(shape);

        shape = new ShapeObject("red", false);
        System.out.println(shape);
    }
}

