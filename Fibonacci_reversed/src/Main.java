import java.math.BigInteger;

public class Main {

    static int fibonacciLength = 80;
    static long[] fibonacciArray = new long[fibonacciLength];
    static long[] reversedFibonacciArray=new long[fibonacciLength];

    public static void main(String[] args) {
        long start = System.nanoTime();
        fillFibonacciArray(0);
        long stop = System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): " + (stop - start));
        long start2 = System.nanoTime();
        reverseFibonacciArray();
        long stop2 = System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): " + (stop2 - start2));
    }

    static long[] fillFibonacciArray(int i) {
        if (i == (fibonacciLength)) {
            return fibonacciArray;
        } else if (i < 2) {
            fibonacciArray[i] = i;
            fillFibonacciArray(++i);
        } else if (i >= 2) {
            fibonacciArray[i] = fibonacciArray[i-1]+ fibonacciArray[i - 2];
            fillFibonacciArray(++i);
        }
        return fibonacciArray;
    }

    static long[] reverseFibonacciArray()
    {
        for(int i=0;i<fibonacciLength;i++)
        {
            reversedFibonacciArray[i]=fibonacciArray[fibonacciLength-1-i];
        }
        return reversedFibonacciArray;
    }


}
