package metodos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BubbleSort {
    private ArrayList<Integer> lista;
    public BubbleSort(){}
    public void ordenacionBurbuja(){
        ArrayList<Integer> lista1 = lista;
        lista1.add(0,72);
        lista1.add(1,24);
        lista1.add(2,3);
        lista1.add(3,154);
        lista1.add(4,3214);
        lista1.add(5,42552);
        int [] numeros= new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)(Math.random()*101);
        }
        int[] variosNumeros={214,214,2121,241215,2512,2521512,555};
        /* En est metodo se va comparando por pares, si el elemento que esta a la izquierda es mayor se hace un
        intercambio consiguiendo que el final sea el más grande*/

        //Esta sería la forma de ordenar de menor a mayor
        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j <lista1.size()-i-1 ; j++) {
                if (lista1.get(j)>lista1.get(j+1)){
                    int temp=lista1.get(j);
                    lista1.set(j, lista1.get(j+1));
                    lista1.set(j+1, temp);
                }
            }
        }

    }
}

