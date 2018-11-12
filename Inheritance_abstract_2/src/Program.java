public class Program {
    public static void main(String[] args) {
        Figure[] figureArray={new Square("square", 11),
                new Circle("circle", 5),
                new Triangle("triangle", 15.43, 6.99),
                new Rectangle("rectangle", 6, 6)};

                for(Figure figure:figureArray)
                {
                    figure.calculateArea();
                    System.out.format("%.2f%n",figure.getArea());
                }
    }
}
