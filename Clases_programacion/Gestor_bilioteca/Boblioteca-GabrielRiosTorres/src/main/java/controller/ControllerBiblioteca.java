package controller;

import model.Biblioteca;
import model.Libro;

import java.util.List;
import java.util.Scanner;

public class ControllerBiblioteca {

    private Biblioteca biblioteca;
    // Crear una biblioteca
        public void crearBiblioteca(){
            System.out.println("Dime el nombre de la biblioteca");
            Scanner scanner=new Scanner(System.in);
            String nombreBiblioteca= scanner.nextLine();
            FileController fileController=new FileController();
            ControllerAPI controllerAPI=new ControllerAPI();
            List<Libro> libros= controllerAPI.importarLibros("https://stephen-king-api.onrender.com/api/books");
            fileController.guardarBiblioteca(nombreBiblioteca,libros);
            fileController.consultarBiblioteca(nombreBiblioteca);
       }
    // Consultar si ya existe alguna biblioteca
        public void comprobarBiblioteca(String nombreBiblioteca){
            FileController fileController=new FileController();
            fileController.consultarBiblioteca(nombreBiblioteca);
        }
    //Consultar un nuevo libro
        public void consultarLibro(){

        }
    //Guardar un nuevo libro en lista de favoritos
        public void sabeLibro(){

        }
}
