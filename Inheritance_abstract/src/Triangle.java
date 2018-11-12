public class Triangle extends Figure {
    private double lengthOfBaseOfTriangle;
    private double heightOfTriangle;

    public Triangle(String name, double lengthOfBaseOfTriangle, double heightOfTriangle) {
        super(name);
        if (lengthOfBaseOfTriangle >= 0 && heightOfTriangle >= 0) {
            this.lengthOfBaseOfTriangle = lengthOfBaseOfTriangle;
            this.heightOfTriangle = heightOfTriangle;
        }
    }
    @Override
    public double calculateArea(Figure triangle) {
        return 0.5 * ((Triangle) triangle).lengthOfBaseOfTriangle * ((Triangle) triangle).heightOfTriangle;
    }
}
