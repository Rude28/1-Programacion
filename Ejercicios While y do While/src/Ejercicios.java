import java.util.Scanner;

public class Ejercicios {
    Scanner entradaDatos = new Scanner(System.in);

    public void ejercicio1() {
        System.out.println("Introduce un número");
        int numeroIntroducido = entradaDatos.nextInt();
        while (numeroIntroducido <= 5) {
            System.out.println(numeroIntroducido);
            numeroIntroducido++;
        }
        entradaDatos.close();
        entradaDatos = null;
    }

    public void ejercicio2() {
        int numeroIntroducido = 0;
        do {
            System.out.println("Introduce la contraseña");
            numeroIntroducido = entradaDatos.nextInt();
        } while (numeroIntroducido != 1234);
        System.out.println("Contraseña correcta");
        entradaDatos.close();
        entradaDatos = null;
    }

    public void ejercicio3() {
        int sumaActual = 0;
        System.out.println("Introduce un número (0 o negativo para terminar):");
        int numeroIntroducido = entradaDatos.nextInt();
        while (numeroIntroducido > 0) {
            sumaActual += numeroIntroducido;
            System.out.printf("Suma actual: %d %n", sumaActual);
            System.out.println("Introduce un número (0 o negativo para terminar):");
            numeroIntroducido = entradaDatos.nextInt();
        }
        System.out.printf("Has terminado. suma total: %d %n", sumaActual);
        entradaDatos.close();
        entradaDatos = null;
    }

    public void ejercicio4() {
        System.out.println("Adivina el número entre 1 y 10");
        int numeroIntroducido = entradaDatos.nextInt();
        int intentos = 0;
        do {
            if (numeroIntroducido > 7) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }
            System.out.println("Introduce tu número otra vez");
            numeroIntroducido = entradaDatos.nextInt();
            intentos++;
        } while (numeroIntroducido != 7);
        System.out.printf("¡Correcto! Has adivinado tu número en %d intentos", intentos);
        entradaDatos.close();
        entradaDatos = null;
    }

    public void ejercicio5() {
        System.out.printf("--- MENÚ --- %n 1. Saludar %n 2. Despedirse %n 3. Ver hora %n 4. Salir %n Elige una opción %n");
        int opcionEntrada = entradaDatos.nextInt();
        do {
            switch (opcionEntrada) {
                case 1 -> {
                    System.out.println("Hola");
                    System.out.println("Elige otra opcion");
                    opcionEntrada=entradaDatos.nextInt();
                }
                case 2 -> {
                    System.out.println("Chao, chao");
                    System.out.println("Elige otra opcion");
                    opcionEntrada=entradaDatos.nextInt();
                }
                case 3 -> {
                    System.out.println("Son las 11 en Canarias");
                    System.out.println("Elige otra opcion");
                    opcionEntrada=entradaDatos.nextInt();
                }
                case 4 -> opcionEntrada*=0;
            }

        }while (opcionEntrada != 0) ;
        System.out.println("Adioooos");
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio6(){
        System.out.println("Introduce un número");
        int numeroEntrada= entradaDatos.nextInt();
        System.out.println("Cuenta atrás");
        System.out.println(numeroEntrada);
        while (numeroEntrada!=1){
            numeroEntrada--;
            System.out.println(numeroEntrada);
        }
        System.out.println("Despeguee");
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio7(){
        System.out.println("¿Cuántas calificaciones vas a introducir?");
        int numeroCalifcaciones= entradaDatos.nextInt();
        double numeroEntrada=0;
        double divisor=numeroCalifcaciones;
        double numeroFinal=0;
        while (numeroCalifcaciones!=0){
            System.out.println("Introduce la calificacion");
            numeroEntrada=entradaDatos.nextDouble();
            numeroCalifcaciones--;
            numeroFinal+=numeroEntrada;
        }
        System.out.println("Suma total " +numeroEntrada);
        System.out.println("Promedio de calificaciones: "+(numeroFinal/divisor));
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio8 (){
        System.out.println("Introduce tu edad. Debe de estar entre 0 y 120");
        int numeroEntrada= entradaDatos.nextInt();
        do {
            System.out.println("Entrada no válida. Debe de estar entre 0 y 120.");
            System.out.println("Introduce tu edad. Debe de estar entre 0 y 120");
            numeroEntrada= entradaDatos.nextInt();
        }while (numeroEntrada<0||numeroEntrada>120);
        System.out.printf("Entrada válida: %d años. ¡Gracias!", numeroEntrada);
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio9(){
        /*System.out.println("¿Cuantos estudiantes hay?");
        int numeroEntrada=entradaDatos.nextInt();
        int[] notas = new int[numeroEntrada];
        for (int i = 0; i < numeroEntrada; i++) {
            System.out.printf("Dime la nota del estudiante %d (0-10) %n",i);
            int nota=entradaDatos.nextInt();
            notas[i]=nota;
        }
        System.out.println("--- Reporte de calificaciones ---");
        for (int i = 0; i < numeroEntrada; i++) {
            System.out.printf("Estudiante %d: %d puntos",i,notas[i]);
            switch (notas[i]){
                case 0,1,2-> System.out.println(" F");
                case 3,4-> System.out.println(" D");
                case 5,6-> System.out.println(" C");
                case 7,8-> System.out.println(" B");
                case 9,10-> System.out.println(" A");
            }
        }
        entradaDatos.close();
        entradaDatos=null;*/
        System.out.println("¿Cuantos estudiantes hay?");
        int numeroEntrada=entradaDatos.nextInt();
        int i = 0;
        int[] notas = new int[numeroEntrada];
        while (i <numeroEntrada) {
            System.out.printf("Dime la nota del estudiante %d (0-10) %n",i+1);
            int nota=entradaDatos.nextInt();
            notas[i]=nota;
            i++;
        }
        System.out.println("--- Reporte de calificaciones ---");
        for (i = 0; i <numeroEntrada; i++) {
            System.out.printf("Estudiante %d: %d puntos",i,notas[i]);
            switch (notas[i]){
                case 0,1,2-> System.out.println(" F");
                case 3,4-> System.out.println(" D");
                case 5,6-> System.out.println(" C");
                case 7,8-> System.out.println(" B");
                case 9,10-> System.out.println(" A");
            }
        }
        entradaDatos.close();
        entradaDatos=null;

    }
    public void ejercicio10(){
        int numeroEntrada=0;
        int saldo=1000;
        int accion=0;
        do {
        System.out.printf("--- CAJERO AUTOMÁTICO ---\n Saldo: %d\n \n --- MENÚ ---\n 1. Consultar saldo\n 2. Retirar dinero\n 3. Depositar dinero\n 4. Salir%n",saldo);
        numeroEntrada= entradaDatos.nextInt();
        if (numeroEntrada>4&&numeroEntrada<1){
            numeroEntrada=4;
        }
        switch (numeroEntrada){
            case 1-> {
                System.out.printf("Su saldo es de %d $ %n",saldo);
            }
            case 2-> {
                System.out.println("¿Cuanto saldo desea retirar?");
                accion=entradaDatos.nextInt();
                while(accion>saldo||accion<0){
                    System.out.println("La accion no se puede realizar, vuelve a introducir el saldo que deseas retirar");
                    accion=entradaDatos.nextInt();
                }
                saldo-=accion;
                System.out.printf("Su saldo es de %d $%n", saldo);
            }
            case 3 ->{
                System.out.println("¿Cuanto saldo desea añadir?");
                accion=entradaDatos.nextInt();
                if (accion<0){
                    System.out.println("Es imposible hacer la acción");
                }
                if (accion>0){
                    saldo+=accion;
                    System.out.printf("Su saldo es de %d $%n", saldo);
                }
            }
        }
        }while(4!=numeroEntrada);
        System.out.println("Chaoo");
    }
}
