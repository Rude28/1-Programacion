package metodos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenacionConteo2 {

        private ArrayList<Integer> lista = new ArrayList<>();

        public OrdenacionConteo2() {
        }

        public OrdenacionConteo2(ArrayList<Integer> lista) {
            this.lista = lista;
        }

        public void ordenacionConteo2() {
            ArrayList<Integer> lista1 = lista;
            lista1.add(0, 2);
            lista1.add(1, 2);
            lista1.add(2, 3);
            lista1.add(3, 1);
            lista1.add(4, 3);
            lista1.add(5, 4);
            //Vamos a empezar con el counting sort.
            //El primer paso es encontrar el valor maximo del array
            int maximo=0;
            for (int i = 0; i < lista1.size(); i++) {
                maximo=Collections.max(lista1);
            }
            //Ahora le sumamos uno al maximo para hacer poder tener la posicion 0
            maximo+=1;
            // Despues creamos un nuevo array que vaya contando las posiciones
            int []conteo=new int[maximo+1];
            //Ahora conteo tiene las dimensiones de max mas uno, y ahora vamos a sumar
            for (int i = 0; i < conteo.length; i++) {
                int num=lista1.get(i);      //situamos a los numeros en su posicion y le sumamos uno ya que tenemos la posicion 0
                conteo[num]++;              // le indicamos a conteo que si en esa posicion hay un umero se sume uno
            }
            int indice=0;
            for (int i = 0; i < conteo.length; i++) {
                while (conteo[i]>0){
                    lista1.set(indice,i);
                    indice++;
                    conteo[i]--;
                }
            }
        }
        public ArrayList<Integer> getLista () {
            return lista;
        }

        public void setLista (ArrayList < Integer > lista) {
            this.lista = lista;
        }

}


