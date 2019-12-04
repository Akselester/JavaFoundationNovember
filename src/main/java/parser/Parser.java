package parser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Parser {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://obsproject.com/wiki/OBS-Studio-Overview/")).build();
        String page = "";
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            page = response.body();
        } catch (InterruptedException iexc) {
            System.out.println("Error iexc: ");
            iexc.printStackTrace();
        } catch (IOException ioexc) {
            System.out.println("Error ioexc: ");
            ioexc.printStackTrace();
        }
        System.out.println(page);
    }
}
