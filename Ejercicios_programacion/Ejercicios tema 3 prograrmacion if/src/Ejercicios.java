import java.sql.SQLOutput;
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
    entradaDatos.close();
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
        } else if ( nota >= 9) {
            System.out.println("Tienes un sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Tienes un notable");
        } else if (nota >= 6) {
            System.out.println("Tienes un bien");
        } else if (nota >= 5) {
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
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu altura en cm");
        int altura=entradaDatos.nextInt();
        if(altura<120){
            System.out.println("No puedes subir a la atracción. Altura minimaes 120cm");
        } else if (altura>= 120 && altura<=200) {
            System.out.println("Puedes sibir a ala atracción");
        }else {
            System.out.println("No puedes subir a la atraccion. Altura maxima de 200cm");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio11(){
        entradaDatos=new Scanner(System.in);
        System.out.println("¿Cual es el precio?");
        double precio= entradaDatos.nextDouble();
        System.out.println("¿Eres socio?(True/False)");
        boolean socio=entradaDatos.nextBoolean();
        double precioFinal;
        double descuento;
        if (precio>200 && socio){
            System.out.println("Eres socio y tu compra es de"+ precio+"$");
            descuento=20;
            precioFinal=(precio*20)/100;
            System.out.println("Descuento de Socio "+descuento+"%:"+precioFinal);
            precioFinal=precio-precioFinal;
            System.out.println("El precio final es de:"+precioFinal);
        } else if (precio>300 && !socio) {
            System.out.println("No eres socio y tu compra es de"+ precio+"$");
            descuento=5;
            precioFinal=(precio*20)/100;
            System.out.println("Descuento de no socio "+descuento+"%:"+precioFinal);
            precioFinal=precio-precioFinal;
            System.out.println("El precio final es de:"+precioFinal);
        }else{
            System.out.println("No tienes decuento tienes que pagar"+precio);
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio12(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu contraseña");
        String contrasenia=entradaDatos.nextLine();
        boolean longitud=contrasenia.length()>=8;
        System.out.println("Tu contraseña es de mas de 8 caracteres "+longitud);
        boolean numero=contrasenia.matches(".*\\d*.");
        System.out.println("Tu contraseña contiene un numero "+numero);
        if(contrasenia.equals("password")||contrasenia.equals("12345678")){
            if (numero&&longitud){
            System.out.println("Tu contraseña es valida");
            }else if (numero&&!longitud){
            System.out.println("Cotnraseña no valida, debe de tener almenos ocho caracteres");
            }else if (!numero&&longitud){
            System.out.println("Tu contraseña no es valida, debe de tener almenos un numero");
            }else {
            System.out.println("Contraseña no valida");
            }
        }else{
            System.out.println("Contraseña no valida, es demasiado generica");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio13(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad= entradaDatos.nextInt();
        entradaDatos.nextLine();
        System.out.println("Introduce el día de la semana");
        String diaSemana=entradaDatos.nextLine();
        System.out.println("Edad:"+edad+" años");
        System.out.println("Día de la semana "+diaSemana);
        int precioEntrada=10;
        if (edad<12){
            precioEntrada=-precioEntrada;
            System.out.println("Precio de la entrada:" + precioEntrada);
        } else if (edad<17) {
            precioEntrada/=0.5;
            if (diaSemana.equals("Martes")){
            boolean confirmacion=diaSemana.equals("Martes");
            System.out.println("¿Es martes?"+confirmacion);
            precioEntrada=-precioEntrada;
            System.out.println("Precio de la entrada:" + precioEntrada);
            }else{System.out.println("Precio de la entrada:" + precioEntrada);}
        } else if (edad<64) {
            if (diaSemana.equals("Jueves")){
            boolean confirmacion=diaSemana.equals("Jueves");
            System.out.println("¿Es Jueves?"+confirmacion);
            precioEntrada-=3;
            System.out.println("Precio de la entrada:" + precioEntrada);
            }else {System.out.println("Precio de la entrada:" + precioEntrada);}
        }else if (edad>64){
            precioEntrada-=4;
            System.out.println("Precio de la entrada:" + precioEntrada);
        }else{
            System.out.println("Introduce una edad correcta");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio14(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad= entradaDatos.nextInt();
        System.out.println("Introduce tus ingresos mensuales");
        int ingresosMensuales= entradaDatos.nextInt();
        System.out.println("Introduce si tienes deudas o no (True/False)");
        boolean deudas=entradaDatos.nextBoolean();
        System.out.println("¿Edad entre 21 y 65?: "+edad);
        System.out.println("¿Ingresos>=1000?: "+ ingresosMensuales);
        System.out.println("¿Sin deudas pendientes?: "+deudas);
        boolean valided=true;
        if (edad>=21&&edad<=65&&ingresosMensuales>=1000&&deudas){
            System.out.println("¿Es elegible para el prestamo?"+valided);
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo");
        } else{
        valided=false;
            System.out.println("¿Es elegible para el prestamo?"+valided);
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio15(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce el peso del paquete en kg");
        int peso= entradaDatos.nextInt();
        System.out.println("Introduce la distancia en envio en km");
        int distancia= entradaDatos.nextInt();
        System.out.println("¿Envío urgente?(True/False)");
        boolean urgente=entradaDatos.nextBoolean();
        double precio=5.0;
        System.out.println("El precio base es: "+precio+"$");
        System.out.println("El peso del paquete es: " + peso + "kg"+" (excede en "+(peso-2)+"kg los 2 kg");
        if (peso>5) {
            int costeAdicionalPeso=4;
            System.out.println("Coste adicional por peso "+costeAdicionalPeso+"$");
            precio+=costeAdicionalPeso;
        }
        System.out.println("La distancia es de "+distancia+"(mayor de 100km)");
        if (distancia>100){
            double costeAdicionalDistancia= 10;
            System.out.println("Coste adicional por distancia "+costeAdicionalDistancia+"$");
            precio+=costeAdicionalDistancia;
        }
        System.out.println("Subtutal: "+ precio+"$");
        System.out.println("¿El envio es urgente? " +urgente);
        if (urgente){
            double costeUrgencia= precio*1.5;
            System.out.println("Recargo por urgencia x 1.5: "+costeUrgencia+"$");
            precio+=costeUrgencia;
        }
        System.out.println("Coste total del envio: "+precio+"$");
    }
}

