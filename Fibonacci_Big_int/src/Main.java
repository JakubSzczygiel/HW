import java.math.BigInteger;

public class Main {

    static int fibonacciLength = 1000;
    static BigInteger[] fibonacciArray = new BigInteger[fibonacciLength];
    static BigInteger[] reversedFibonacciArray=new BigInteger[fibonacciLength];
    public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        long start=System.nanoTime();
        fillFibonacciArray(0);
        reverseFibonacciArray();
        //long stop = System.currentTimeMillis();
        long stop = System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): " + (stop - start));
    }

    static void fillFibonacciArray(int i) {
        if (i == (fibonacciLength)) {
            return;
        } else if (i < 2) {
            fibonacciArray[i] = BigInteger.valueOf(i);
            fillFibonacciArray(++i);
        } else if (i >= 2) {
            fibonacciArray[i] = fibonacciArray[i-1].add(fibonacciArray[i - 2]);
            fillFibonacciArray(++i);
        }
    }

    static void reverseFibonacciArray()
    {
        for(int i=0;i<fibonacciLength;i++)
        {
            reversedFibonacciArray[i]=fibonacciArray[fibonacciLength-1-i];
        }
    }


}
