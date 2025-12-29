package Controller;

import Model.Campeonato;
import Model.Carrera;
import Model.Coche;
import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;
@Data

public class CampeonatoController {
    private ArrayList<Coche> listaCoches = new ArrayList<>();
    private ArrayList<Carrera> listaCarreras = new ArrayList<>();
    private CarreraController carreraController;
    //Constructor
    public CampeonatoController() {
        CrearCampeonato();
        IniciarCarrera();
    }

    //Funcionalidades
    private class Utilidades{
        private static int leerEntero(Scanner addNumeros) {
            while (!addNumeros.hasNextInt()) {
                System.out.println("Eso no es un número entero. Inténtalo de nuevo");
                addNumeros.next();
            }
            return addNumeros.nextInt();
        }
    }
    //En crear campeonato creo a los coches y a las carreras
    private void CrearCampeonato() {
        ArrayList<Coche> listaCoches = new ArrayList<>();
        ArrayList<Carrera> listaCarreras = new ArrayList<>();
        Campeonato campeanato=new Campeonato(listaCarreras,listaCoches);
        System.out.println("Vamos a crear un campeonato");
        System.out.println("Dime el númeero de coches");
        Scanner addDatos = new Scanner(System.in);
        int numeroCoches = Utilidades.leerEntero(addDatos);
        for (int i = 0; i < numeroCoches; i++) {
            System.out.println("Dime el nombre del piloto del coche"+(i+1));
            String nombreCoche = addDatos.nextLine();
            addDatos.next();
            Coche coche = new Coche(nombreCoche, i, 0, 0, 0);
            listaCoches.add(coche);
            System.out.println("Coche añadido");
        }
        System.out.println("Dime el numero de carreras");
        int numeroCarreras=Utilidades.leerEntero(addDatos);
        for (int i = 0; i < numeroCarreras; i++) {
            System.out.printf("Dime el nombre de la carrera %d%n",i+1);
            String nombreCarrera= addDatos.nextLine();
            System.out.println("Dime los km de la carrera");
            int kilometrosCarreras=Utilidades.leerEntero(addDatos);
            Carrera carrera=new Carrera(listaCoches, kilometrosCarreras,nombreCarrera);
            listaCarreras.add(carrera);
        }
    }
    private void IniciarCarrera(){
        carreraController=new CarreraController();
        carreraController.SimularCarrera();
    }

}