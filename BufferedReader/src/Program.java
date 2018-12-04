import java.io.BufferedReader;
import java.io.FileReader;

public class Program {

    public static void main(String[] args) {
        int total=0;
        BufferedReader bufferedReader=null;

        try {
            String line=null;
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Jakub\\IdeaProjects\\HW\\Banking_application\\Numbers.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
                System.out.println("Total: " + total);
            }
            System.out.println("Total: " + total);
        }
        catch (Exception e)
        {
            System.out.println("Opening or Reading from file didn't go well");
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (Exception e)
            {
                System.out.println("Closing file didn't go well");

            }

        }

    }
}
