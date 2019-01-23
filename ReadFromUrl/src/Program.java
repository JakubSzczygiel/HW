import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Program {
    public static void main(String[] args) {
        Reader reader=new Reader();

        try {
            InputStream url = new URL("https://pl.wikipedia.org/wiki/Polska").openStream();
           // System.out.println("Method 1: "+ reader.getNumberOfStringOccuranceMethod1("Polska",url));
           // System.out.println("Method 2: "+ reader.getNumberOfStringOccuranceMethod2("Polska",url));
            System.out.println("Method 3: "+ reader.getNumberOfStringOccuranceMethod3("Polska",url));
           // System.out.println("Method 4: "+ reader.getNumberOfStringOccuranceMethod4("Polska",url));

        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Malformed url exception");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO exception");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("smth go wrong");
        }


    }


}
