/*SwapValues
You have two variables. The goal is to swap their values and print the value of each variable.
Example: you have x=1 and y=2. After your program you should have x=2 and y=1.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static int x, y;

    public static void main(String[] args) {
        x=readInt('x');
        y=readInt('y');
        System.out.println("Your x is: " + x + " and y is: " + y);
        swapValues(x,y);
    }



    static int readInt(char name)
    {
        int variable;
        boolean variableAssigned=false;
        do {
            try {
                System.out.println("Assign value to variable " + name + " : ");
                Scanner readVariable = new Scanner(System.in);
                variable = readVariable.nextInt();
                variableAssigned=true;
                return variable;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Wrong variable format. Please use int");
            }
        }while(variableAssigned==false);
        return 0;
    }

    static void swapValues(int variableA, int variableB)
    {
        variableA+=(variableB-(variableB=variableA));
        x=variableA;
        y=variableB;
        System.out.println("Your values are swapped now. \nNow x is: " + x + " and y: " + y);
    }
}
