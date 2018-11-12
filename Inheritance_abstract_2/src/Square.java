public class Square extends Figure {
    private double lengthOfSideOfSquare;

    public Square(String name, double lengthOfSideOfSquare) {
        super(name);
        if (lengthOfSideOfSquare >= 0) {
            this.lengthOfSideOfSquare = lengthOfSideOfSquare;
        }
    }

    @Override
    public void calculateArea() {
        setArea(Math.pow(lengthOfSideOfSquare, 2));
    }

}
