import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[]listaNumeros=new int[5];
        //[0, 0, 0, 0, 0] -> posiciones 0,1,2,3,4
        boolean[]listaAciertos=new boolean[3];
        //[false, false, false]
        double[] listaNotas=new double[6];
        //[0, 0, 0, 0, 0, 0]
        String[]listaNombres=new String[4];
        //[null, null, null, null]
        System.out.println("Cuantos numeros quieres guarda");
        int tamanionumeros= scanner.nextInt();
        int [] listaNmeros2=new int[tamanionumeros];
        // esto para pedir que el usuario meta el numero de tamanio

        int[]listaNumerosIntroducidos=new int[]{54, 35, 50, 78};
        // esto es lo mismoint[]listaNumerosIntroducidos={54, 35, 50, 78};

        listaNumeros[listaNumeros.length-1]=34; // para meter un numero en última posición
        listaNumeros[0]=64; // para meter un numero en primera posición
        listaNumeros[listaNumeros.length/2]=56; //para meter un numero a la mitad
        //[64,0,0,0,56,0,0,34]

        // para acceder al valor
        System.out.println("La posicion 0 es " +listaNumeros[0]);

        // para acceder a todos los elementos
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
        // para rellenar tods los elementos con un random
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i]=(int) (Math.random()*51);
        }
        int sumatorio=0;
        // el sumatorio de todos los números
        for (int i = 0; i < listaNumeros.length; i++) {
            sumatorio+=listaNumeros[i];
        }
        //cuando no necesitamos acceder a ninguna posicion en concreto usamor un foreach
        for (int item: listaNumeros) {
            System.out.println("Ejecutando valor "+item);
            sumatorio += item;
        }

    }
}
