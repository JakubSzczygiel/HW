import java.util.Scanner;

public class Reader {

    static double readRadiusValue(Circle circle) {


        System.out.println("Give the radius value of your " + circle.name + " : " );
        boolean isValid = false;

        do {
            Scanner readVariable = new Scanner(System.in);
            isValid = Validator.checkIfDouble(readVariable);

            if (isValid == false) {
                System.out.println("Wrong value!");
            } else {

                return readVariable.nextDouble();
            }
        } while (isValid == false);

        return 0;
    }
}
