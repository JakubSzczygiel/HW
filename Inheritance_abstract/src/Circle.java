public class Circle extends Figure {
    private double circleRadius;

    public Circle(String name, double circleRadius) {
        super(name);
        if (circleRadius >= 0) {
            this.circleRadius = circleRadius;
        }
    }
    @Override
    public double calculateArea(Figure circle) {
        return Math.PI * Math.pow(((Circle) circle).circleRadius, 2);
    }

}
