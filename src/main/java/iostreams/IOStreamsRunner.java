package iostreams;

import java.io.*;

public class IOStreamsRunner {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputstring = bufferedReader.readLine();
            System.out.println("Our string " + inputstring);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter(new File("file.txt"));
            writer.print("Something\ndskvdksvm\nsdcscds\n");
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("File output");
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(new File("file.txt")));
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
