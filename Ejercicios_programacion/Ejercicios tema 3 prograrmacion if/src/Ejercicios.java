import java.util.Scanner;

public class Ejercicios {
    private Scanner entradaDatos;
    public void ejercicio1(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad= entradaDatos.nextInt();
        if (edad>=18) {
            System.out.println("Eres mayor de edad. Puedes votar");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio2(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero= entradaDatos.nextInt();
        if (numero>0) {
            System.out.println("El numero es positivo");
        } else if (numero==0) {
            System.out.println("El numero es cero");
        } else if (numero<0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("Introuce un numero");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio3(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu nota");
        double nota=entradaDatos.nextDouble();
        if (nota >=5) {
            System.out.println("Has aprobado");
        } else if (nota<5) {
            System.out.println("Has suspendido");
        }else {
            System.out.println("Introduce una nota valida");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio4 (){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce el precio del articulo");
        double precio=entradaDatos.nextDouble();
        double descuento= 10;
        if (precio>100){
            double precioDescontado=(precio*descuento)/100;
            double precioFinal= precio-precioDescontado;
            System.out.println("El precio es "+precio);
            System.out.println("El descuento es "+precioDescontado);
            System.out.println("El precio final es "+ precioFinal);
        }else{
            System.out.println("Introduce un precio correcto");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio5() {
        entradaDatos = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= entradaDatos.nextInt();
        numero%=2;
        if (numero==0) {
            System.out.println("El numero es igual");
        } else if (numero!=0) {
            System.out.println("El numero es impar");
        }else{
            System.out.println("Introduce un numero");
        }
    entradaDatos.close()
    entradaDatos=null;
    }
    public void ejercicio6(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu edad para ver el contenido");
        int edad= entradaDatos.nextInt();
        if (edad>=16) {
            System.out.println("Eres mayor de edad. Puedes ver el contenido");
        } else if (edad<16) {
            System.out.println("No puedes ver el contenido");
        }else {
            System.out.println("Introduce un numero");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio7() {
        entradaDatos = new Scanner(System.in);
        System.out.println("Introduce tu enota");
        int nota = entradaDatos.nextInt();
        if (nota == 10) {
            System.out.println("Tienes una matricula. Oleee");
        } else if (nota < 10 && nota < 9) {
            System.out.println("Tienes un sobresaliente");
        } else if (nota < 9 && nota < 7) {
            System.out.println("Tienes un notable");
        } else if (nota < 7 && nota < 6) {
            System.out.println("Tienes un bien");
        } else if (nota < 6 && nota < 5) {
            System.out.println("Tienes un aprobado");
        } else if (nota < 5) {
            System.out.println("Tienes un suspenso. Estas jodido -.-");
        } else {
            System.out.println("Introduce una nota correcta");
        }
        entradaDatos.close();
        entradaDatos = null;
    }
    public void ejercicio8(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero= entradaDatos.nextInt();
        System.out.println("Introduce el segundo numero");
        int numeroDos= entradaDatos.nextInt();

        if (numero==numeroDos) {
            System.out.println("Ambos numeros son iguales "+numero+numeroDos);
        } else if (numero>numeroDos) {
            System.out.println("El número" +numero+" es mayor que "+numeroDos);
        } else if (numero<numeroDos) {
            System.out.println("El número "+numeroDos+"es mayor que "+numero);
        } else  {
            System.out.println("Introduce un numero correcto");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio9(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu peso en kg");
        int peso= entradaDatos.nextInt();
        System.out.println("Introduce tu altura en metros");
        double altura= entradaDatos.nextDouble();
        double imc=peso/(altura*altura);
        System.out.println("Tu Imc es "+imc);
        if (imc<18.5) {
            System.out.println("Tu peso es bajo");
        } else if(imc>18 && imc<24.9)  {
            System.out.println("Tu peso es normal");
        } else if (imc>24.9) {
            System.out.println("Estar por ecima del peso normal");
        }else {
            System.out.println("Introduce valores correctos");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio10(){

    }
}

