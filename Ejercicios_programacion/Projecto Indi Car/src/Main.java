import Controller.CampeonatoController;
import Controller.CarreraController;
import Model.Campeonato;
import Model.Carrera;
import Model.Coche;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a crear un campeonato");
        ArrayList<Coche> listaCoches=new ArrayList<>();
        Scanner addDatos=new Scanner(System.in);
        System.out.println("Introduce el número de coches que vamos a crear");
        while(!addDatos.hasNextInt()){
            System.out.println("Eso no es un número entero. Inténtalo de nuevo");
            addDatos.next();
        }
        int addEnteros=addDatos.nextInt();
        addDatos.nextLine();
        for (int i = 0; i < addEnteros; i++) {
            System.out.println("Dime el nombre del piloto del coche"+(i+1));
            String nombreCoche = addDatos.nextLine();
            Coche coche = new Coche(nombreCoche, i+1, 0, 0, 0);
            listaCoches.add(coche);
            System.out.println("Coche añadido");
        }
        System.out.println("Dime el numero de carreras que hay en el campeonato");
        while(!addDatos.hasNextInt()){
            System.out.println("Eso no es un número entero. Inténtalo de nuevo");
            addDatos.next();
        }
        System.out.println("Introduce el numero de carreras que vamos a crear");
        addEnteros=addDatos.nextInt();
        addDatos.nextLine();
        ArrayList<Carrera> listaCarreras=new ArrayList<>();
        for (int i = 0; i < addEnteros; i++) {
            System.out.printf("Dime el nombre de la carrera %d%n",i+1);
            String nombreCarrera= addDatos.nextLine();
            System.out.println("Dime los km de la carrera");
            while(!addDatos.hasNextInt()) {
                System.out.println("Eso no es un número entero. Inténtalo de nuevo");
                addDatos.next();
            }
            int kilometrosCarreras=addDatos.nextInt();
            addDatos.nextLine();
            Carrera carrera=new Carrera(listaCoches, kilometrosCarreras,nombreCarrera);
            listaCarreras.add(carrera);
        }
        System.out.println("--- Iniciando Campeonato ---");
        Campeonato campeonato=new Campeonato(listaCarreras);
        CampeonatoController campeonatoController=new CampeonatoController(campeonato);
        campeonatoController.iniciarCampeonato();
    }
}
