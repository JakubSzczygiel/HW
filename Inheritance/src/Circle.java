public class Circle extends Figure {
    private double circleRadius;

    public Circle(String name, double circleRadius) {
        super(name);
        this.circleRadius = circleRadius;
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.circleRadius, 2);
    }

}
