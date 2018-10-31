/*CalculateCircleLength
You have a radius of the circle. You should write a program that will calculate the circle length. Call to memory the formula from geometry or just google this formula;)
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Length of the circle is: " +calculateCircleLength(readDouble()));
    }


    static double calculateCircleLength(double radiusValue){
        return 2*Math.PI*radiusValue;
    }


    static double readDouble() {
        double variable = Integer.MAX_VALUE;
        boolean variableAssigned = false;
        do {
            try {
                System.out.println("Enter radius value: ");
                Scanner readVariable = new Scanner(System.in);
                variable = readVariable.nextDouble();
                variableAssigned = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong variable format. Please use double value");
            }
            if (variable < 0) {
                System.out.println("Wrong radius value. Please use radius bigger than 0");
            }
        } while (variableAssigned == false ||  variable < 0);
        return variable;
    }
}

