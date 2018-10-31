public class Main {


    public static void main(String[] args) {
        int numberOfStars = 10;
        printStars(numberOfStars);

    }

    static void printStars(int num) {

        for (int i = num; i > 0; ) {
            if (i == num && i != 1) {
                System.out.println(i + " Stars");
                num--;
            } else if (num >= 0 && num != i) {
                System.out.print("*");
                num--;
            } else if (i == 1) {
                System.out.println(i + " Star");
                System.out.print("*");
                --i;
            } else {
                System.out.print("\n");
                num = --i;
            }
        }
    }
}
