public class Rectangle extends Figure {
    private double lengthOfFirstSideOfRectangle;
    private double lengthOfSecondSideOfRectangle;

    public Rectangle(String name, double lengthOfFirstSideOfRectangle, double lengthOfSecondSideOfRectangle) {
        super(name);
        if (lengthOfFirstSideOfRectangle >= 0 && lengthOfSecondSideOfRectangle >= 0) {
            this.lengthOfFirstSideOfRectangle = lengthOfFirstSideOfRectangle;
            this.lengthOfSecondSideOfRectangle = lengthOfSecondSideOfRectangle;
        }
    }

    public double calculateArea(Rectangle rectangle) {
        return rectangle.lengthOfFirstSideOfRectangle * rectangle.lengthOfSecondSideOfRectangle;
    }
}
