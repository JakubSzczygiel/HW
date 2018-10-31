/*Write a program that will return sum of all character in string
 */

public class Main {

    public static void main(String[] args) {
        String stringVariable = "kuba ";
        System.out.println("Sum of all characters in string is equal to " + returnSumOfAllCharactersInString(stringVariable));

    }

    static int returnSumOfAllCharactersInString(String stringVariable) {
        int sumOffAllCharactersInString = 0;
        for (int i = 0; i < stringVariable.length(); i++) {
            sumOffAllCharactersInString += (int) stringVariable.charAt(i);
        }
        return sumOffAllCharactersInString;
    }
}
