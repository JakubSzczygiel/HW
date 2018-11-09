public class Program {
    public static void main(String[] args) {
        Square square = new Square("square", 10);
        Circle circle = new Circle("circle", 8);
        Triangle triangle = new Triangle("triangle", 15.43, 6.99);
        Rectangle rectangle = new Rectangle("rectangle", 6, 6);

        System.out.format("%.2f%n", calculateFigureArea(square));
        System.out.format("%.2f%n", calculateFigureArea(circle));
        System.out.format("%.2f%n", calculateFigureArea(triangle));
        System.out.format("%.2f%n", calculateFigureArea(rectangle));


    }

    public static double calculateFigureArea(Figure figure) {
        switch (figure.getClass().getTypeName()) {
            case ("Square"):
                return ((Square) figure).calculateSquareArea((Square) figure);

            case ("Circle"):
                return ((Circle) figure).calculateCircleArea((Circle) figure);

            case ("Triangle"):
                return ((Triangle) figure).calculateTriangleArea((Triangle) figure);

            case ("Rectangle"):
                return ((Rectangle) figure).calculateRectangleArea((Rectangle) figure);
        }
        return 0;
    }

}
