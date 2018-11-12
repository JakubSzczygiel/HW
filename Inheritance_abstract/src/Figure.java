public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }
    public abstract double calculateArea(Figure figure);
}
