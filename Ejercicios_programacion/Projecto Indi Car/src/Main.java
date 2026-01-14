import Controller.CampeonatoController;
import Model.Campeonato;
import Model.Carrera;
import Model.Coche;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Bienvenido al creador de campeonatos");
        ArrayList<Coche> listaCoches=new ArrayList<>();
        Scanner addDatos=new Scanner(System.in);
        System.out.println("Por favor, introduce el número de coches que va a tener el campeonato");
        comprobarEntero(addDatos);

        int addEnteros=addDatos.nextInt();
        while (addEnteros<3){
            System.out.println("Introduce más coches, necesitamos por lo menos tres");
            comprobarEntero(addDatos);
            addEnteros=addDatos.nextInt();
        }

        System.out.println("________________________________________");
        addDatos.nextLine();
        for (int i = 0; i < addEnteros; i++) {
            System.out.println("Porfavor, dime el nombre del piloto del coche "+(i+1));
            String nombreCoche = addDatos.nextLine();
            System.out.println("Porfavor, dime el nombre de la marca del coche "+(i+1));
            String marca = addDatos.nextLine();
            Coche coche = new Coche(nombreCoche, i+1, 0, 0, 0, marca);
            listaCoches.add(coche);
            System.out.println("Exito, coche añadido");
            System.out.println(" ");
        }
        System.out.println("________________________________________");
        System.out.println("Introduce el numero de carreras que vamos a crear");

        comprobarEntero(addDatos);

        int addNumeroCarreras=addDatos.nextInt();
        while (addNumeroCarreras<=1){
            System.out.println("Introduce más carreras, necesitamos por lo menos dos");
            comprobarEntero(addDatos);
            addNumeroCarreras=addDatos.nextInt();
        }
        addDatos.nextLine();
        ArrayList<Carrera> listaCarreras=new ArrayList<>();
        System.out.println(" ");
        for (int i = 0; i < addNumeroCarreras; i++) {
            System.out.printf("Dime el nombre de la carrera %d%n",i+1);
            String nombreCarrera= addDatos.nextLine();
            System.out.println("Dime los km de la carrera");
            comprobarEntero(addDatos);
            int kilometrosCarreras=addDatos.nextInt();
            while (kilometrosCarreras<100){
                System.out.println("Introduce más kilometros, necesitamos por lo menos 100 para que se pueda correr");
                comprobarEntero(addDatos);
                kilometrosCarreras=addDatos.nextInt();
            }
            addDatos.nextLine();
            Carrera carrera=new Carrera(listaCoches, kilometrosCarreras,nombreCarrera);
            listaCarreras.add(carrera);
            kilometrosCarreras=0;
        }
        Campeonato campeonato=new Campeonato(listaCarreras);
        CampeonatoController campeonatoController=new CampeonatoController(campeonato);
        campeonatoController.retardo();
        System.out.println("============== Campeonato creado con exito ===============");
        System.out.println("================ Iniciando el Campeonato =================");
        campeonatoController.iniciarCampeonato(campeonato);
    }

     static void comprobarEntero(Scanner addEntero){
        while(!addEntero.hasNextInt()){
            System.out.println("Eso no es un número entero. Inténtalo de nuevo");
            addEntero.next();
        }
    }
}

