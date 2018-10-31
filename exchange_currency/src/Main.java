/*ExchangeCurrency
        You should define an rates of currencies to Polish Zloty (example: EUR/PLN, USD/PLN, etc).
        Your program should print how many EUR and USD we shall obtain if we change certain amount of Polish Zloty.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double plnToEur = 4.3172, plnToUsd = 3.7508;

    public static void main(String[] args) {
        double plnAmount = readDouble();
        System.out.printf("You would get: %.2f euro %n",exchangeCurrencyFromPln(plnAmount, plnToEur));
        System.out.printf("You would get: %.2f dollars %n",exchangeCurrencyFromPln(plnAmount, plnToUsd));
    }


    static double exchangeCurrencyFromPln(double plnAmount, double factor) {
        return (plnAmount / factor);
    }

    static double readDouble() {
        double variable = Integer.MAX_VALUE;
        boolean variableAssigned = false;
        do {
            try {
                System.out.println("How many PLNs you would like to change: ");
                Scanner readVariable = new Scanner(System.in);
                variable = readVariable.nextDouble();
                variableAssigned = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong variable format. Please use double value");
            }
            if (variable < 0) {
                System.out.println("Wrong PLN amount. Please use value bigger than 0");
            }
        } while (variableAssigned == false || variable < 0);
        return variable;
    }

}
