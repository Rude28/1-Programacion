package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Libro;

import java.io.*;
import java.util.List;

@Data

public class FileController {
    // Guardar biblioteca
    public void guardarBiblioteca(String nombreBiblioteca, List<Libro> libros){
        File file=new File("src/main/java/resourcesFiles/"+ nombreBiblioteca+".json");
        Gson gson=new Gson();
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
            String json= gson.toJson(libros);
            bufferedWriter.write(json);
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Error al encontrar la ruta");
        }
    }

    // Consultar biblioteca
    public void consultarBiblioteca(String nombreBiblioteca){
        File file=new File("src/main/java/resourcesFiles/"+ nombreBiblioteca+".json");
        Libro libro=new Libro();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String linea=null;
            while ((linea= bufferedReader.readLine())!=null){
                System.out.println("El titulo del libro es: "+libro.getData().getTitle());
                System.out.println("El año de publicación del libro es: "+ libro.getData().getYear());
                System.out.println("El número de paginas del libro es: " + libro.getData().getPages());
                System.out.println("El id del libro es: " + libro.getData().getId());
                System.out.println("Los villanos del libro son: ");
                for (int i = 0; i < libro.getData().getVillains().length; i++) {
                    System.out.println(libro.getData().getVillains()[i]);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Herror al encontrar la ruta");
        } catch (IOException e) {
            System.out.println("Error al leer la línea");
        }

    }

    //Guardar favoritosBiblioteca
    public void guardarLibroFavorito(String nombreBiblioteca,int numeroFavorito, String nombreLibro, int id){
        Libro libro=new Libro();
        File file=new File("src/main/java/resourcesFiles/"+ nombreBiblioteca+"favoritos"+".json");
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("Numero de favorito",numeroFavorito);
        jsonObject.addProperty("Nombre del libro",nombreLibro);
        jsonObject.addProperty("Id",id);

        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(jsonObject.toString());
        } catch (IOException e) {
            System.out.println("Error al encontrar la ruta");
        }

    }
    // Exportar la lista de favoritos de la biblioteca
    public void consultarListaFavoritos(String nombreBiblioteca){
        File file=new File("src/main/java/resourcesFiles/"+ nombreBiblioteca+"favoritos");
    }
}
