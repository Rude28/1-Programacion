import controller.ControllerBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bienvenido al creador de biliotecas del maestro de terror");
        System.out.println("Dime lo que quieres hacer");
        System.out.println("Si quieres ver que bibliotecas hay creadas pulsa 1");
        System.out.println("Si quieres crear una nueva biblioteca pulsa 2");
        ControllerBiblioteca controllerBiblioteca=new ControllerBiblioteca();
        controllerBiblioteca.crearBiblioteca();
        /*int numero_entrada=scanner.nextInt();
        if (numero_entrada==2){
            ControllerBiblioteca controllerBiblioteca=new ControllerBiblioteca();

        }*/



        /*switch (scanner){
            case 1-> System.out.println("");
            case 2-> System.out.println("");
            case 3-> System.out.println("");
            case 4-> System.out.println("");
            case 5-> System.out.println("");
        }*/
    }
    public void comprobadorNumeros(int numero){

    }
}

