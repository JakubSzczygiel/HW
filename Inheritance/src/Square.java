public class Square extends Figure {
    private double lengthOfSideOfSquare;

    public Square(String name, double lengthOfSideOfSquare) {
        super(name);
        this.lengthOfSideOfSquare = lengthOfSideOfSquare;
    }

    public double calculateSquareArea(Square square) {
        return Math.pow(square.lengthOfSideOfSquare, 2);
    }

}
