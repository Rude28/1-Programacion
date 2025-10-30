import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operadores operacionesVariables = new Operadores();
        operacionesVariables.operadoresAritmeticos();
        Scanner entradaDatos = new Scanner(System.in);
        // entrada de datos scanner en la que creamos un nuevo objeto (entrada por teclado)
        System.out.println("Que salario quieres cobrar");
        String nombre=entradaDatos.nextLine();
        //debemos de poner next. line detras del objeto para que nos lea los espacios, si no
        //al primer espacio que demos nos va a pasar la entrada de datos
        System.out.println("Que salario quieres cobrar");
        int salario=entradaDatos.nextInt();
    }
}