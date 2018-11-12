public class Program {
    public static void main(String[] args) {
        Square square = new Square("square", 11);
        Circle circle = new Circle("circle", 5);
        Triangle triangle = new Triangle("triangle", 15.43, 6.99);
        Rectangle rectangle = new Rectangle("rectangle", 6, 6);

        System.out.format("%.2f%n", calculateFigureArea(square));
        System.out.format("%.2f%n", calculateFigureArea(circle));
        System.out.format("%.2f%n", calculateFigureArea(triangle));
        System.out.format("%.2f%n", calculateFigureArea(rectangle));
    }

    public static double calculateFigureArea(Figure figure) {
        figure.calculateArea();
        return figure.getArea();
    }

}
