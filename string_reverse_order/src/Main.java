/*Write a program that will print String in reverse order
 */

public class Main {

    public static void main(String[] args) {
        String stringVariable = "kubak";
        System.out.println("Your string presented in reverse order : " + returnStringInReverseOrder(stringVariable));

    }

    static String returnStringInReverseOrder(String stringVariable) {
        char[] tempCharArray = new char[stringVariable.length()];
        for (int i = 0; i < stringVariable.length(); i++) {
            tempCharArray[i] = stringVariable.charAt(stringVariable.length() - 1 - i);
        }
        return String.valueOf(tempCharArray);
    }
}
