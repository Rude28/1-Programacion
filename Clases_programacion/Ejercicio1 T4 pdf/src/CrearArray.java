import java.util.Scanner;

public class CrearArray {
    Scanner entradaDatos;
    private int lineaX;
    private int lineaY;
    private int[][]matriz;
    public void pedirTamanio(){
        entradaDatos=new Scanner(System.in);
        System.out.println("Dime la longitud X de la matriz");
        lineaX= entradaDatos.nextInt();
        System.out.println("Dime la longitud Y de la matriz");
        lineaY= entradaDatos.nextInt();
    }
    public void rellenarArray(){
        matriz=new int[lineaX][lineaY];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random()*51);
            }
        }
    }
    public int[][] getMatriz() {
        return matriz;
    }
}
