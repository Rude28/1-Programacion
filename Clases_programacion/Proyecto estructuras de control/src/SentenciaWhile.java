import java.util.Scanner;

public class SentenciaWhile {
    public void evaluacionnumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        /*while (numero<10){
            System.out.println("El numero introducido es menor que 10");
        }
        Esto se va a estar todo el rato, tenemos que darle una salida
        */
        int intentos = 1;
        while (numero < 10) {
            System.out.println("El numero introducido es menor que 10");
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
            intentos++;//para contar los intentos
        }


        int aleatorio = (int) (Math.random() * 11);
        //debemos de hacer primero la multiplicacion por que la clase random nos da numero de 0.algo
        // debemos de multiplicar por uno mas al numero que queremos llegar
        // es decir debemos de 1-10, lo multiplico por once

        /*La concicion que marquemos en el do se va a repetir hasta que llegemos a la condicion
        que tenemos marcada en el while, ahi entonces para
        */
        int numeroUno=0;
        do{
            System.out.println("Ejecutando sentencia repetiviva cond do-while");
            System.out.println("introduce el numero nuevamente");
            numeroUno= scanner.nextInt();
        }while (numeroUno!=0);
            System.out.println("Finalizando la repeticion");

    }
    public void imprimirMenu(){
        Scanner scaner=new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("Indica que operacion quieres realizar");
            numero=scaner.nextInt();
        switch (numero){
            case 1-> System.out.println("Opcion selecionada suma");
            case 2-> System.out.println("Opcion selecionada resta");
            case 3-> System.out.println("Opcion selecionada multiplicacion");
            case 4-> System.out.println("Opcion selecionada division");
        }
        }while (numero!=5);
        System.out.println("Finalizado");
    }
}

