public class Square extends Figure {
    private double lengthOfSideOfSquare;

    public Square(String name, double lengthOfSideOfSquare) {
        super(name);
        if (lengthOfSideOfSquare >= 0) {
            this.lengthOfSideOfSquare = lengthOfSideOfSquare;
        }
    }

    @Override
    public double calculateArea(Figure square) {
        return Math.pow(((Square) square).lengthOfSideOfSquare, 2);
    }

}
