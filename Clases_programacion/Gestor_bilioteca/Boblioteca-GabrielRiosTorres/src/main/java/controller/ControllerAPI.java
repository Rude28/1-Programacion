package controller;

import com.google.gson.Gson;
import lombok.Data;
import model.Libro;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Data

public class ControllerAPI {
    // Importar lista de libros
    public List<Libro> importarLibros(String url){
        List<Libro>libros=new ArrayList<>();
        Gson gson=new Gson();
        try {
            HttpClient httpClient=HttpClient.newHttpClient();
            HttpRequest httpRequest= HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response=httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
            JSONObject jsonObject=new JSONObject(response.body());
            JSONArray jsonArray= jsonObject.getJSONArray("data");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject librosJSON=jsonArray.getJSONObject(i);
                    Libro libro=gson.fromJson(librosJSON.toString(), Libro.class);
                    libros.add(libro);
                }
            System.out.println("numero de libros: "+ libros.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            System.out.println("Error al recibir la respuesta");
        }
        return libros;
    }
}
