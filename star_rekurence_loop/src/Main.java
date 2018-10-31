public class Main {
    public static void main(String[] args) {
        int numberOfStars = 1;
        printStars(numberOfStars);
    }
    static void printStars(int num) {
        if (num > 0) {
            System.out.println(num + " Stars");
            for (int i = num; i > 0; i--) {
                System.out.print("*");
            }
            System.out.print("\n");
            printStars(num - 1);
        } else {
            return;
        }
    }
}
