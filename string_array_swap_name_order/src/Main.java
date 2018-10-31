public class Main {

    public static void main(String[] args) {
        String[] stringVariable = {"Kuba", "Kasia", "Mateusz", "Paulina"};
        stringArrayInReverseOrder(stringVariable);
    }

    static void stringArrayInReverseOrder(String[] stringVariable) {
        String[] tempStringArray = stringVariable.clone();
        for (int i = 0; i < stringVariable.length; i++) {
            stringVariable[i] = tempStringArray[stringVariable.length - i - 1];
            if (i < stringVariable.length - 1)
                System.out.print(stringVariable[i] + ", ");
            else
                System.out.print(stringVariable[i] + "\n");
        }
    }
}
