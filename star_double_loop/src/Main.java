public class Main {
    public static void main(String[] args) {
        int numberOfStars = 10;
        printStars(numberOfStars);
    }
    static void printStars(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i + " Stars");
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
