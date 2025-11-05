import java.util.Scanner;

public class Ejercicios {
    Scanner entradaDatos;

    public void ejercicio1() {
        entradaDatos = new Scanner(System.in);
        int numero = entradaDatos.nextInt();
        System.out.println("Introduce un número 1-7"+numero);
        switch (numero) {
            case 1 -> System.out.println("El día "+numero+" es: lunes");
            case 2 -> System.out.println("El día "+numero+" es: martes");
            case 3 -> System.out.println("El día "+numero+" es: miercoles");
            case 4 -> System.out.println("El día "+numero+" es: jueves");
            case 5 -> System.out.println("El día "+numero+" es: viernes");
            case 6 -> System.out.println("El día "+numero+" es: sábado");
            case 7 -> System.out.println("El día "+numero+" es: domingo");
            default -> System.out.println("Opcion invalida");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio2(){
        entradaDatos = new Scanner(System.in);
        String letra= entradaDatos.nextLine();
        System.out.println("Introduce tu calificacion de A-F: "+ letra);
        switch (letra) {
            case "A" -> System.out.println("Calificacion"+letra+": Excelente");
            case "B" -> System.out.println("Calificacion"+letra+": Muy bien");
            case "C" -> System.out.println("Calificacion"+letra+": Bien");
            case "D" -> System.out.println("Calificacion"+letra+": Suficiente");
            case "E" -> System.out.println("Calificacion"+letra+": Suficiente");
            case "F" -> System.out.println("Calificacion"+letra+": Insuficiente");
            default -> System.out.println("Opcion invalida");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio3(){
        entradaDatos = new Scanner(System.in);
        System.out.println("Dame dos números");
        int numero = entradaDatos.nextInt();
        int numeroDos =entradaDatos.nextInt();
        entradaDatos.nextLine();
        System.out.println("Introduce la operacion + - * / ");
        String operacion=entradaDatos.nextLine();
        switch (operacion){
            case"+"-> System.out.println("Resultado de la operacion " + numero+operacion+numeroDos+" es "+(numero+=numeroDos));
            case"-"-> System.out.println("Resultado de la operacion " + numero+operacion+numeroDos+" es "+(numero-=numeroDos));
            case"*"-> System.out.println("Resultado de la operacion " + numero+operacion+numeroDos+" es "+(numero*=numeroDos));
            case"/"-> System.out.println("Resultado de la operacion " + numero+operacion+numeroDos+" es "+(numero/=numeroDos));
            default -> System.out.println("Opcion invalida");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejerecicio4(){
        entradaDatos = new Scanner(System.in);
        int numero = entradaDatos.nextInt();
        System.out.println("--- MENÚ ---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.println("Elige una opción:"+numero);
        switch (numero) {
            case 1 -> System.out.println("Has selecionlado: Ver perfil");
            case 2 -> System.out.println("Has selcecionado: Configuración");
            case 3 -> System.out.println("Has selecionado: Ayuda");
            case 4 -> System.out.println("Has selecionado: Salir");
            default -> System.out.println("Opcion invalida");

        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio5(){
        entradaDatos = new Scanner(System.in);
        int mes = entradaDatos.nextInt();
        System.out.println("Introduce el mes del año");
        switch (mes) {
            case 1, 2, 12 -> System.out.println("El mes " + mes + "corresponde a: Invierno");
            case 3, 4, 5 -> System.out.println("El mes " + mes + "corresponde a: Primavera");
            case 6, 7, 8 -> System.out.println("El mes " + mes + "corresponde a: Vernao");
            case 9, 10, 11 -> System.out.println("El mes " + mes + "corresponde a: Otoño");
            default -> System.out.println("Opcion invalida");

        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio6(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= entradaDatos.nextInt();
        System.out.println("Tabla del "+numero);
        for (int i = 1; i <=10; i++) {
            int numeroMultiplicado=numero*i;
            System.out.println("El "+numero+"*"+i+" = "+numeroMultiplicado);
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio7(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce un número");
        int tope= entradaDatos.nextInt();
        int resultado=0;
        for ( int i = 0; i <=tope ; i++) {
            resultado+=i;
        }
        System.out.println("El resultado de sumar del 1 al "+tope);
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio8(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= entradaDatos.nextInt();
        int factorial=1;
        for (int i = 1; i <=numero ; i--) {
            factorial*=i;
        }
        System.out.printf("El factorial de %d es %d",numero,factorial);
    }
    public void ejercicio9(){
        entradaDatos=new Scanner(System.in);
        System.out.printf("--- EJERCICIOS ---\n" + "1. Flexiones\n" + "2. Abdominales\n" +
                "3. Sentadillas\n" + "Elige un ejercicio (1-3): 1");
        int ejercicio= entradaDatos.nextInt();
        System.out.println("¿Cuantas repeticiones?");
        int repeticiones=entradaDatos.nextInt();
        switch (ejercicio){
            case 1 -> System.out.println("Has elegido: Flexiones");
            case 2 -> System.out.println("Has elegido: Abdominales");
            case 3 -> System.out.println("Has elegido: Sentadillas");
            default -> System.out.println("No has eleguido nada");
        }
        for (int i = 0; i <repeticiones; i++) {
            System.out.printf("Repeticion %d completada",i);
        if (i==repeticiones){
            System.out.printf("¡Ejercicio completado! Has hecho %d flexiones",repeticiones);
        }
        }
    }

}
