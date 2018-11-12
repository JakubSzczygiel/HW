public class Circle extends Figure {
    private double circleRadius;

    public Circle(String name, double circleRadius) {
        super(name);
        if (circleRadius >= 0) {
            this.circleRadius = circleRadius;
        }
    }

    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.circleRadius, 2);
    }

}
