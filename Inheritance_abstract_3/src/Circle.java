public class Circle extends Figure {
    private double circleRadius;

    public Circle(String name, double circleRadius) {
        super(name);
        if (circleRadius >= 0) {
            this.circleRadius = circleRadius;
        }
    }
    @Override
    public void calculateArea() {
        setArea(Math.PI * Math.pow(circleRadius, 2));
    }

}
