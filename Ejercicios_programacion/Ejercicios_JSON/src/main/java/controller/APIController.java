
package controller;

import com.google.gson.Gson;
import model.User;
import modelDummy.DummyJSON;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Una api es una interfaz (el punto de contacto de dos progrmas que lo conecta)
// que permite a dos programas que se comuniquen entre sí. Osea una api nos permite controlar un programa desde otro
// programa

public class APIController {
    private String urlBase="https://randomuser.me/api/";
    public void obtenerUser(){
        try {
        Gson gson=new Gson();
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest
                .newBuilder()
                .uri(URI.create(urlBase))
                .GET()
                .build();
        HttpResponse<String>response=client.send(request,HttpResponse.BodyHandlers.ofString());
        JSONObject responseJSON=new JSONObject(response.body());
        // este response body traducelo a json y lo ponen en una clase json

        JSONArray arrayUsuarios=responseJSON.getJSONArray("results");
        //pilla el campo results y crea un objeto JSON array

            for (int i = 0; i < arrayUsuarios.length(); i++) {
                User usuario=gson.fromJson(responseJSON.toString(),User.class);
                // la librería lo traduce de un string JSON a un objeto en java
                System.out.println(usuario.getResults()[0].getName());
                usuario.getResults()[0].getLocation();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void obtenerDummy(){
        try {
        Gson gson=new Gson();
        urlBase="https://dummyjson.com/products?limit=5";
        // Cliente
        HttpClient client=HttpClient.newHttpClient();
        // Pregunta
        HttpRequest request= HttpRequest
                .newBuilder()
                .uri(URI.create(urlBase))
                .GET()
                .build();

        // Respuesta en <String>
        HttpResponse<String>response= client.send(request, HttpResponse.BodyHandlers.ofString());

        // objeto JSON de respuesta
        JSONObject objectoDummy=new JSONObject(response.body());
        // array del JSON de respuesta
        JSONArray arrayDummy=objectoDummy.getJSONArray("products");

        // me reocorro el array
            for (int i = 0; i < arrayDummy.length(); i++) {
                DummyJSON dummyJSON=gson.fromJson(objectoDummy.toString(), DummyJSON.class);
                dummyJSON.getProducts()[i].getId();
                dummyJSON.getProducts()[i].getTitle();
                dummyJSON.getProducts()[i].getPrice();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void pedirDummy(){
        Gson gson=new Gson();
        urlBase="https://dummyjson.com/products?limit=5";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime el numero de identificación que necesitas");
        int identificador=scanner.nextInt();
        // Cliente
        HttpClient client=HttpClient.newHttpClient();
        // Pregunta
        HttpRequest request= HttpRequest
                .newBuilder()
                .uri(URI.create(urlBase))
                .GET()
                .build();

        try {
            // Respuesta
            HttpResponse<String> responseDummy=client.send(request,HttpResponse.BodyHandlers.ofString());
            //Objeto JSON
            JSONObject objetoDummy= new JSONObject(responseDummy.body());
            //Array de JSON
            JSONArray arrayDummy=objetoDummy.getJSONArray("products");
            for (int i = 0; i < arrayDummy.length(); i++) {
                DummyJSON dummyJSON = gson.fromJson(objetoDummy.toString(), DummyJSON.class);
                if(i==identificador-1){
                    dummyJSON.getProducts()[i].getTitle();
                    dummyJSON.getProducts()[i].getDescription();
                    dummyJSON.getProducts()[i].getCategory();
                }
            }
        } catch (IOException e) {
            System.out.println("Error en la comunicación");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void obtenerPlaceholder(){
        String url1="https://jsonplaceholder.typicode.com/todos/1";
        Gson gson=new Gson();
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request1= HttpRequest.newBuilder().uri(URI.create(url1)).GET().build();
        try {
            HttpResponse<String> response1= client.send(request1, HttpResponse.BodyHandlers.ofString());
            JSONObject objectPlaceholder1=new JSONObject(response1.body());
            int userId=objectPlaceholder1.getInt("userId");
            String url2="https://jsonplaceholder.typicode.com/users/"+userId;
            HttpRequest request2= HttpRequest.newBuilder().uri(URI.create(url2)).GET().build();
            HttpResponse<String> response2= client.send(request2, HttpResponse.BodyHandlers.ofString());
            JSONObject objectPlaceholder2=new JSONObject(response2.body());
            System.out.println(objectPlaceholder2.getString("name"));
            JSONObject address = objectPlaceholder2.getJSONObject("address");
            System.out.println(address.getString("street"));
            System.out.println(address.getString("city"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void pokeApiStats(){
        // cliente
        HttpClient client=HttpClient.newHttpClient();
        // pregunta
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/pikachu"))
                .GET()
                .build();
        // respuesta
        try {
            HttpResponse<String> response= client.send(request,HttpResponse.BodyHandlers.ofString());
            JSONObject jsonObject=new JSONObject(response.body());
            System.out.println(jsonObject.getString("name"));
            System.out.println(jsonObject.getInt("height"));
            System.out.println(jsonObject.getInt("weight"));
            JSONArray stats=jsonObject.getJSONArray("stats");
            for (int i = 0; i < 3; i++) {
                JSONObject stat=stats.getJSONObject(i);
                System.out.println(stat.getJSONObject("stat").getString("name"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void openTrivia(){
        //clinte
        HttpClient client=HttpClient.newHttpClient();
        //pregunta
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create("https://opentdb.com/api.php?amount=3&type=multiple"))
                .GET()
                .build();

        //respuesta
        try {
            HttpResponse<String> response= client.send(request,HttpResponse.BodyHandlers.ofString());

            JSONObject object=new JSONObject(response.body());
            JSONArray array=object.getJSONArray("results");
            for (int i = 0; i < array.length(); i++) {
                System.out.println("First caregory");
                JSONObject object1= array.getJSONObject(i);
                System.out.println(object1.getString("category"));
                System.out.println(object1.getString("question"));
                System.out.println(object1.getString("correct_answer"));
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
