package iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IOStreamTask {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> buffer = new ArrayList<>();
        int i = 0;
        String line;
        try {
            while (!(line = reader.readLine()).contains("exit")) {
                //something
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
