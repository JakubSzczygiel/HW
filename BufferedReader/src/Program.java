import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        int total = 0;
        BufferedReader bufferedReader = null;

        try {
            String line = null;
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Jakub\\IdeaProjects\\HW\\Banking_application\\Numbers.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total: " + total);
        } catch (NumberFormatException e) {
            System.out.println("Your file should contain only numbers!");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("IO problem occured");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception e) {
                System.out.println("Closing file didn't go well");
            }
        }
    }
}
