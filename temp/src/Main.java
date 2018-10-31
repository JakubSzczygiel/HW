public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapValues(a, b);
        System.out.println(a +" " + b);
    }

    public static void swapValues(int i, int j) {
        int k = i;
        i = j;
        j = k;
    }
}
