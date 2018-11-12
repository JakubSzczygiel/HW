public class Square extends Figure {
    private double lengthOfSideOfSquare;

    public Square(String name, double lengthOfSideOfSquare) {
        super(name);
        if (lengthOfSideOfSquare >= 0) {
            this.lengthOfSideOfSquare = lengthOfSideOfSquare;
        }
    }


    public double calculateArea(Square square) {
        return Math.pow(square.lengthOfSideOfSquare, 2);
    }

}
