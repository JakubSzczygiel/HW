/*Write a program that will count the number of occurrences of a String in a String?
e.g. “jo” occurs in “jo234234jsdasd44t3f3gjo23423423refsdfjom”
 */

public class Main {


    public static void main(String[] args) {
        String stringVariableShort = "aa";
        String stringVariableLong = "aaaa";
        System.out.println(countNumberOfOccurrencesOfStringInString(stringVariableShort, stringVariableLong));
    }

    static int countNumberOfOccurrencesOfStringInString(String stringVariableShort, String stringVariableLong) {
        int numberOfOccurrencesOfStringInString = 0;

        for (int i = 0; i <= (stringVariableLong.length() - stringVariableShort.length()); i++) {
            if (stringVariableLong.substring(i, i + stringVariableShort.length()).equals(stringVariableShort)) {
                numberOfOccurrencesOfStringInString++;
            }
        }
        return numberOfOccurrencesOfStringInString;
    }


}
