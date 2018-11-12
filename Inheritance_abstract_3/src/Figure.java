public abstract class Figure {
    private String name;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Figure(String name) {
        this.name = name;
    }

    public abstract void calculateArea();
}
