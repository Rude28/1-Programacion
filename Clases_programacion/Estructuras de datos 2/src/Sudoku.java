public class Sudoku {
    int[][]cuadrado=new int[4][4];

    public void iniciarCuadrado(){
        System.out.println("Procedemos a iniciar el cuadrado");
        rellenarCuadrado();
        mostraCuadrados();
    }
    public void rellenarCuadrado(){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length ; j++) {
                int aleatorio=(int)(Math.random()*16)+1;
                cuadrado[i][j]= aleatorio;

            }
        }
    }
    private boolean astaNumero(int numero){
        //el numero que quiero comparar
            //recorrer que quieres roecorrer
                //if que compare
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                if (item == numero) {
                    return true;// esto hace que el programa vuelva con el numero verdadero
                }
            }
        }
        return false;
    }
    public void mostraCuadrados(){
        for (int[] filas : cuadrado) {
            for (int item:filas){
                System.out.printf("%d\t",item);
            }
        }
    }


}
