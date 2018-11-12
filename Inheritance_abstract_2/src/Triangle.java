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
    public void calculateArea() {
         setArea(0.5 * lengthOfBaseOfTriangle * heightOfTriangle);
    }
}
