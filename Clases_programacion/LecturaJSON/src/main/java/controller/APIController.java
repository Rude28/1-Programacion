package controller;

import com.google.gson.Gson;
import model.Clasificacion;
import model.Liga;
import model.Equipo;
import model.Team;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {
        //pegamos la url de la api
    private String urlBase = "https://www.thesportsdb.com/api/v1/json/123/";

    public void obtenerLigas() {
        String urlLigas = urlBase + "all_leagues.php";
        HttpClient client = null;

        try {
            // el try es para garantizar que las conexiones se cierren correctamente, en este caso el HTTP client
            // esto es para convertir JSON a objetos
            Gson gson = new Gson();
            //1 paso-> abro el navegador mi aplicacon de correo (el medio)
            client = HttpClient.newHttpClient();

            //2 paso-> crea la petición o el correo que estoy escribiendo, esta escrito pero es muy simple osea una solicitud
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlLigas))
                    .GET().build();
                        /*
                        -get para hacer un select
                        post- para hacer un insert
                        put- para hacer un update
                        delet-para hacer un borrado(delete)
                        */
            //3 -> espera la respuesta, la respuesta se hace en string
            // el objeto http response es de tipo string
            // la respuesta es un string fruto de que mando a traves del navegador(client) gracias una solicitud (request)
            HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Mapear es pasar una serie de datos y ponerlos en algun sitio donde/como me vaya bien

            //4-> convertir la String en JSON object para pasar del crudo que me viene a un objeto JSONobject
            JSONObject objectLigas = new JSONObject(response.body());
            // me devuelve un array
            JSONArray arrayLigas = objectLigas.getJSONArray("leagues");
            // recorro el array
            for (int i = 0; i < arrayLigas.length(); i++) {
                // en cada elemento del array hay un objeto JSON entonces le digo que me lo vaya sacando
                JSONObject ligaJSON = arrayLigas.getJSONObject(i);
                // aqui objetenemos el identificador de la liga
                // con el mapeador pasamos del string para no tener que ir de uno en uno para sacarlo
                Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class);
                // aquí imprimimos el identificador de la liga
                System.out.println(liga);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            client.close();
        }
    }

    public void obtenerClasificacion(String id) {
        String urlClasificacion = urlBase + "lookuptable.php?l=" + id;
        try {
            Gson gson = new Gson();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject objectClasificacion = new JSONObject(response.body());
            JSONArray arrayEquipos = objectClasificacion.getJSONArray("table");
            for (int i = 0; i < arrayEquipos.length(); i++) {

                JSONObject equipoJSON = arrayEquipos.getJSONObject(i);
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.printf("%s - %s - %s - %s - %s%n",
                        equipo.getIntRank(),
                        equipo.getStrTeam(),
                        equipo.getIntWin(),
                        equipo.getIntDraw(),
                        equipo.getIntLoss());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerClasificacionCompleta(String id){
        String urlClasificacion = urlBase + "lookuptable.php?l=" + id;
        try {
            Gson gson = new Gson();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject objectClasificacion = new JSONObject(response.body());
            Clasificacion clasificacion = gson.fromJson(objectClasificacion.toString(), Clasificacion.class);

            for (int i = 0; i < clasificacion.getTable().length; i++) {
                Team team = clasificacion.getTable()[i];
                System.out.printf("%s - %s - %s - %s - %s%n",
                        team.getIntRank(),
                        team.getStrTeam(),
                        team.getIntWin(),
                        team.getIntDraw(),
                        team.getIntLoss());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
