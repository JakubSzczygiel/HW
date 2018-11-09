public class Rectangle extends Figure {
    private double lengthOfFirstSideOfRectangle;
    private double lengthOfSecondSideOfRectangle;

    public Rectangle(String name, double lengthOfFirstSideOfRectangle, double lengthOfSecondSideOfRectangle) {
        super(name);
        this.lengthOfFirstSideOfRectangle = lengthOfFirstSideOfRectangle;
        this.lengthOfSecondSideOfRectangle = lengthOfSecondSideOfRectangle;
    }

    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.lengthOfFirstSideOfRectangle * rectangle.lengthOfSecondSideOfRectangle;
    }
}
