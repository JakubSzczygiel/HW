import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {

    public int getNumberOfStringOccuranceMethod1(String soughtString, InputStream url) throws IOException {
        int numberOfOccurances = 0;
        byte[] buffer = new byte[1000];
        int count;
        StringBuilder textFromUrl = new StringBuilder();
        while ((count = url.read(buffer)) != -1) {
            textFromUrl.append(new String(buffer, 0, count));
        }
        // System.out.println(textFromUrl.toString());
        numberOfOccurances = textFromUrl.toString().split(soughtString).length - 1;
        return numberOfOccurances;
    }

    public int getNumberOfStringOccuranceMethod2(String soughtString, InputStream url) throws IOException {
        int numberOfOccurances = 0;
        byte[] buffer = new byte[10000];
        int count;
        while ((count = url.read(buffer)) != -1) {
            numberOfOccurances += new String(buffer, 0, count).split(soughtString).length - 1;
        }
        return numberOfOccurances;
    }

    public int getNumberOfStringOccuranceMethod3(String soughtString, InputStream url) throws IOException {
        int numberOfOccurances = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url));
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
           // System.out.println(inputLine);
            numberOfOccurances += inputLine.split(soughtString).length - 1;
        }
        bufferedReader.close();
        return numberOfOccurances;
    }

    public int getNumberOfStringOccuranceMethod4(String soughtString, InputStream url) throws IOException {
        int numberOfOccurances = 0;
        String substring;
        byte[] buffer = new byte[1000];
        int count;
        StringBuilder textFromUrl = new StringBuilder();
        while ((count = url.read(buffer)) != -1) {
            textFromUrl.append(new String(buffer, 0, count));
        }
        // System.out.println(textFromUrl.toString());
       substring = textFromUrl.substring(textFromUrl.indexOf("id=\"content\""),textFromUrl.indexOf("id=\"mw-navigation\""));
       numberOfOccurances=substring.split(soughtString).length-1;
        // numberOfOccurances = textFromUrl.toString().split(soughtString).length - 1;
        System.out.println(substring);
        return numberOfOccurances;
    }
}
