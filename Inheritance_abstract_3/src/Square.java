public class Square extends Rectangle {
    //private double lengthOfSideOfSquare;

    public Square(String name, double lengthOfSideOfSquare) {
        super(name,lengthOfSideOfSquare, lengthOfSideOfSquare);
    }

    @Override
    public void calculateArea() {
        setArea(Math.pow(lengthOfFirstSideOfRectangle, 2));
    }

}
