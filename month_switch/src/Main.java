/*
Write a method that will print name of month based on its number for example input will be 12 output will 'December'
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number you select represents: " + returnMonthName(readInt()));
        System.out.println("Number you select represents: " + returnMonthNameSwitch(readInt()));

    }

    static String returnMonthName(int monthNumber) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[monthNumber - 1];
    }

    static String returnMonthNameSwitch(int monthNumber) {

        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "oooops. something gone wrong.";
        }
    }


    static int readInt() {
        int variable = Integer.MIN_VALUE;
        boolean variableAssigned = false;
        do {
            try {
                System.out.println("Which month you would like to print? Please use numbers from 1-12");
                Scanner readVariable = new Scanner(System.in);
                variable = readVariable.nextInt();
                variableAssigned = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong variable format. Please use int");
            }
            if (variable > 12 || variable < 0) {
                System.out.println("Wrong variable number. Please use numbers from 1-12");
            }
        } while (variableAssigned == false || variable > 12 || variable < 0);
        return variable;
    }
}

