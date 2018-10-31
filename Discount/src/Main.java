import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        int age=0;
        boolean regularAssigned=false,ageAssigned=false;
        boolean regular=false;
        int discount2;
        double radius;


        do {
            try {
                System.out.println("How old are you?");
                Scanner readAge=new Scanner(System.in);
                age = readAge.nextInt();
                ageAssigned=true;
            } catch (InputMismatchException e) {
                System.out.println("You have entered data in a wrong format");
            }
        }while(ageAssigned==false);

        do {
            try {
                System.out.println("Are you a regular client? (true/false)");
                Scanner readRegular= new Scanner(System.in);
                regular = readRegular.nextBoolean();
                regularAssigned=true;

            } catch (InputMismatchException e) {
                System.out.println("You have entered data in a wrong format");
            }
        }while(regularAssigned==false);

    int discount=Discount.calculations(age, regular);
    discount2= (regular) ? ((age>65 ? 10 : ((age<18) ? 25 : 0))+5) : (age>65 ? 10 : ((age<18) ? 25 : 0));

        System.out.println("Your discount is " + discount + "%");
        System.out.println("Your discount is " + discount2 + "%");




    }




}
