import java.util.Scanner;

public class Ejercicios {
    Scanner entradaDatos;
    public void ejercicio1() {
        String[] frutas = {"manzana", "platano", "fresa", "uva"};

        for (String item: frutas) {
            System.out.println(item);
        }
    }
    public void ejercicio2(){
        int[] numeros={10,20,30,40,50,60};
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posición %d:%d %n",i,numeros[i]);
        }
    }
    public void ejercicio3(){
        entradaDatos=new Scanner(System.in);
        String[] nombres=new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Introduce el nombre" + i);
            String nombre=entradaDatos.nextLine();
            nombres[i]=nombre;
        }
        for (String item: nombres) {
            System.out.println(item);
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio4(){
        entradaDatos=new Scanner(System.in);

        int [] numeros={5, 12, 8, 3, 15, 9, 6};
        System.out.println("Di que numero quieres comprobar");
        int comprobar= entradaDatos.nextInt();
        entradaDatos.nextLine();
        boolean comprobador= false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == comprobar) {
                System.out.printf("El %d esta en el array en la posición %d %n",comprobar,i+1);
                comprobador=true;
            }
        }
        if (comprobador==false){
            System.out.println("El numero no aparece en el array");
        }
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio5(){
        int [] numeros={23, 67, 45, 89, 12, 56, 78, 34, 90, 43};
        int contador=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                contador++;
            }
        }
        System.out.printf("Cantidad de numeros mayores a 50: %d",contador);
    }
    public void ejercicio6(){
        double [] numeros={4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        double suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma +=numeros[i];
        }
        double promedio=suma/numeros.length;
        System.out.println("La suma total de los numeros es "+ suma);
        System.out.println("El promedio de los numeros es "+ promedio);
    }
    public void ejercicio7(){
       int [] numeros={15, 8, 23, 4, 19, 12};
       int mayor=0;
       int menor=1000;
       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] > mayor) {
               mayor=numeros[i];
           }
           if (numeros[i]< menor){
               menor=numeros[i];
           }
        }
        System.out.println("El número mayor es: "+mayor);
        System.out.println("El número menor es: "+menor);
    }
    public void ejercicio8(){
        String [] palabras={"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
        entradaDatos=new Scanner(System.in);
        System.out.println("Introduce una palabra para ver cuantas veces aparece");
        String palabra= entradaDatos.nextLine();
        int contador=0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
            contador ++;
            }
        }
        System.out.println("La palabra "+palabra+" aparece "+ contador+" veces.");
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio9(){
        int[] original={2, 4, 6, 8, 10, 12, 14};
        int []copia=new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("Los numeros del array original son" +original[i]);
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("Los numeros de la copia son "+ copia[i]);
        }
    }
    public void ejercicio10(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Cuantos estudiantes hay");
        int alumnos= entradaDatos.nextInt();
        double[] notas=new double[alumnos];
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce las notas de el alumno");//hay que introducir el dato con coma
            System.out.println("Ejemplo 7,5");
            notas[i]=entradaDatos.nextDouble();
        }
        System.out.println("--- REPORTE DE NOTAS ---");
        System.out.println("Calificaciones");
        for (double nota : notas) {
            System.out.println(nota);
        }
        int promedio=0;
        for (int i = 0; i < notas.length; i++) {
            promedio+=notas[i];
        }
        System.out.println("El promedio de las notas es "+(promedio/ notas.length));
        int aprobados=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >=5) {
                aprobados++;
            }
        }
        System.out.println("El numero de aprobados es "+ aprobados);
        double mayor=0;
        double menor=1000;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor=notas[i];
            }
            if (notas[i]< menor){
                menor=notas[i];
            }
        }
        System.out.println("La nota mayor es "+ mayor );
        System.out.println("La peor nota es "+menor);
    }
}
