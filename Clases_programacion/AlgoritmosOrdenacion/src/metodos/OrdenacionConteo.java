package metodos;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacionConteo {
    private ArrayList<Integer>lista=new ArrayList<>();
    public OrdenacionConteo(){};
    public OrdenacionConteo(ArrayList<Integer> lista) {
        this.lista = lista;
    }
    public void ordenacionConteo(){
        ArrayList<Integer> lista1 = lista;
        lista1.add(0,2);
        lista1.add(1,2);
        lista1.add(2,3);
        lista1.add(3,1);
        lista1.add(4,3);
        lista1.add(5,4);
        //Countin Sort
        /*
            No usa comparaciones lo que le hace muy eficiente, cuenta cuantas veces sale cada numero, despues escribe
            los números en orden usando estos conteos
            Sirve si ya conoces el número maximo que hay
            Ordena el conjunto de elementos por una clasificacion y lo ordena segun esta clasificacion
            Paso a paso:
            primero debemos de contar cuantos numeros hay de cada valor
            los numeros en nuestra tabla auxiliar ya estan ordenados osea que usaremos esta para ver cuantos hay
            en esta posicion
            y despues debemos de hacer una suma acumulativa para encontrar cuantos numeros
            por ultimo debemos de proceder ir ordenando
         */
        // Imprimimos el array
        System.out.println("Empezamos con el array");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.printf("%d ",lista1.get(i));
        }
        System.out.printf("%n");

        // 1. Encontrar el máximo
        int max = Collections.max(lista);    // usa Collections.max para hallar el mayor

        // 2. Array de conteo

        int[] count = new int[max + 1];     // añadimos uno para la posicion 0 del array de conteo

        // 3. Contar cuantas veces sale cada numero
        System.out.println("Empezamos a contar");
        for (int i = 0; i < lista.size(); i++) {        // idea estándar del algoritmo de counting sort
            int num = lista.get(i);                     // coge los elementos de la lista
            count[num]++;                               // pasa por los elementos de la lista y si hay uno lo suma
        }
        /*
        Lo que hace por dentro es esto:
            num = 2 → count[2]++ → [0, 0, 1, 0, 0]

            num = 2 → count[2]++ → [0, 0, 2, 0, 0]

            num = 3 → count[3]++ → [0, 0, 2, 1, 0]

            num = 1 → count[1]++ → [0, 1, 2, 1, 0]

            num = 3 → count[3]++ → [0, 1, 2, 2, 0]

            num = 4 → count[4]++ → [0, 1, 2, 2, 1]
         */
        System.out.println("Ocurrencias contadas");
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d ",count[i]);
        }
        System.out.printf("%n");

        // 4. Volcar de nuevo en la lista, ya ordenada
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {

                lista1.set(index, i);

                index++;                    //hace avanzar la lista

                count[i]--;                 //resta los elementos de la lista que mete
            }
        }
        System.out.printf("%n");

        System.out.println("YA ESTA ORDENADO");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.printf("%d ", lista1.get(i));
        }
        System.out.printf("%n");

    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }
}
