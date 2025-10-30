import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {
    Scanner entradadatos;
    public void ejercicio1(){
        entradadatos=new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int dato1=entradadatos.nextInt();
        System.out.println("Introduce el segundo número");
        int dato2=entradadatos.nextInt();
        System.out.println("Selecciona la operacion");
        System.out.println("Suma: 1");
        System.out.println("Resta: 2");
        System.out.println("Multiplicación: 3");
        System.out.println("División: 4");
        int operacion= entradadatos.nextInt();
        int salida=0;
        if (operacion==1) {
            salida=dato1+dato2;
        } else if (operacion==2) {
            salida=dato1-dato2;
        } else if (operacion==3) {
            salida=dato1*dato2;
        } else if (operacion==4) {
            salida=dato1/dato2;
        }else {
            System.out.println("Vuele a ejecutar el programa");
        }
        System.out.println("El resultado de la operacion es " +salida);
        entradadatos.close();
        entradadatos=null;
    }
    public void ejercicio2(){
        System.out.println("Acontinuacion, introduce dos numeros para que podamos compararlos");
        entradadatos =new Scanner(System.in);
        int numero1= entradadatos.nextInt();
        int numero2= entradadatos.nextInt();
        boolean superioridad1= numero1>numero2;
        System.out.println("El numero 1 es superior al numero 2 "+superioridad1);
        boolean inferioridad1= numero1<numero2;
        System.out.println("El numero 1 es inferior al numero 2 "+inferioridad1);
        boolean igualdad= numero1==numero2;
        System.out.println("Ambos numeros son iguales "+ igualdad);
        boolean diferente= numero1!=numero2;
        System.out.println("Ambos numeros son diferentes "+diferente);
        boolean superioridad2= numero1<numero2;
        System.out.println("El numero dos es superior al numero 1 "+superioridad2);
        boolean inferioridad2= numero1>numero2;
        System.out.println("El numero dos es inferior al numero 1 "+inferioridad2);
        entradadatos.close();
        entradadatos=null;
    }
    public void ejeercicio3(){
        System.out.println("Introduce un operando para el 100");
        entradadatos=new Scanner(System.in);
        int valorInicial= 100;
        int operando=entradadatos.nextInt();
        valorInicial+=operando;
        System.out.println(valorInicial);
        valorInicial=100;
        valorInicial-=operando;
        System.out.println(valorInicial);
        valorInicial*=operando;
        System.out.println(valorInicial);
        valorInicial=100;
        valorInicial/=operando;
        System.out.println(valorInicial);
        entradadatos.close();
        entradadatos=null;
    }
    public void ejercicio4(){
        entradadatos=new Scanner(System.in);
        int numero=entradadatos.nextInt()%2;
        if(numero==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
            entradadatos.close();
            entradadatos=null;
        }
    }
    public void ejercicio5(){
        entradadatos=new Scanner(System.in);
        System.out.println("Introduce tu edad porfavor");
        int edad= entradadatos.nextInt();
        entradadatos.nextLine();
        System.out.println("¿Tienes carnet?");
        String carnet= entradadatos.nextLine();
        if (carnet.equalsIgnoreCase("Si") && edad>=21) {
            System.out.println("Puedes conducir");
        }else if (carnet.equalsIgnoreCase("No") || edad<21) {
            System.out.println("No puedes conducir");
        }else{
            System.out.println("Introduce bien los datos");
        }
    entradadatos.close();
        entradadatos=null;
    }
    public void ejercicio6(){
        entradadatos=new Scanner(System.in);
        System.out.println("Introduce el producto");
        int preio= entradadatos.nextInt();
        System.out.println("Introduce el descuento");
        int descuetno= entradadatos.nextInt();
        int precioFinal=(preio*descuetno)/100;
        System.out.println("El precio original era= "+preio);
        System.out.println("El descuento es= "+descuetno);
        System.out.println("El descuento es= "+precioFinal);
        entradadatos.close();
        entradadatos=null;
    }
    public void ejercicio7(){
        entradadatos=new Scanner(System.in);
        System.out.println("Introducce tu edad");
        int edad= entradadatos.nextInt();
        System.out.println("¿Eres estudiante?");
        boolean estudiante=entradadatos.nextBoolean();
        boolean joven=edad<26;
        boolean especial= edad<26 && estudiante;
        System.out.println("Tienes descuento joven "+joven);
        System.out.println("Tienenes descuento estudiante "+ estudiante);
        System.out.println("Tienens descuento especial "+especial);
        entradadatos.close();
        entradadatos=null;
    }
    public void ejercicio8(){
        entradadatos=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int primerNumero=entradadatos.nextInt();
        System.out.println("Introduce el segundo numero");
        int segundoNumero=entradadatos.nextInt();
        System.out.println("Introduce el tercer numero");
        int tercerNumero=entradadatos.nextInt();
        int suma=primerNumero+segundoNumero+tercerNumero;
        int promedio= suma/3;
        int operacion=(primerNumero+segundoNumero)/tercerNumero;
        System.out.println("El resultado de la suma de los tres numeros es: "+suma);
        System.out.println("El promedio de los tres numeros es:"+promedio);
        System.out.println("El resultado de sumar los dos primeros numeros y dividirlos por el tercer es: "+operacion);
        entradadatos.close();
        entradadatos=null;
    }

}
