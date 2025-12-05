public class ArraysMultidimensionales {
    public void lsitasMultidimensionales (){
        int[][] numerosUno= new int[4][4];
        /* numeros
        1, 2, 3, 4
        1, 2, 3, 4
        1, 2, 3, 4
        Así creamos un array de cuatro filas y en cada una con cuatro columnas
        */
        int[][] numeros= new int[][] {{4,3,7},{1,8,9},{11,18,19}};
        System.out.println(numeros[0][2]);
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Accedoemdp a ñas filas");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("\t Accediendo a las columnas");
                /* para rellenar con numeros random seria de esta forma
                numeros[i][j] =(int)(Math.random()*16)+1;
                en este caso seria entre numero del uno al dieciseis
                */
            }
        }
        //para recorrer los for con for each
        for (int[] fila : numeros) {
            for (int item:fila){
                System.out.printf("/t %d", item);
            }
        }
    }
}
