public class Rectangle extends Figure {
    protected double lengthOfFirstSideOfRectangle;
    protected double lengthOfSecondSideOfRectangle;

    public Rectangle(String name, double lengthOfFirstSideOfRectangle, double lengthOfSecondSideOfRectangle) {
        super(name);
        if (lengthOfFirstSideOfRectangle >= 0 && lengthOfSecondSideOfRectangle >= 0) {
            this.lengthOfFirstSideOfRectangle = lengthOfFirstSideOfRectangle;
            this.lengthOfSecondSideOfRectangle = lengthOfSecondSideOfRectangle;
        }
    }
    @Override
    public void calculateArea() {
         setArea(lengthOfFirstSideOfRectangle * lengthOfSecondSideOfRectangle);
    }
}
