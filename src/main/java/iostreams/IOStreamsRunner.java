package iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamsRunner {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputstring = bufferedReader.readLine();
            System.out.println("Our string " + inputstring);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
