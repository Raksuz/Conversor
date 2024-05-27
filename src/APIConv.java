import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class APIConv {

    public Tarifa ObtnrJson(String mon1, String mon2, Double cantidad){
        String ruta = "https://v6.exchangerate-api.com/v6/0ec60d32487a6f4ca087cdc9/pair/"+ mon1 + "/" + mon2 + "/" + cantidad;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ruta))
                .build();
            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            return new Gson().fromJson(response.body(), Tarifa.class);
        }
    public void mostrarR() {

    }
}