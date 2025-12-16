public class Suma {
    public void sumarArray(){
        CrearArray matriz1=new CrearArray();
        CrearArray matriz2=new CrearArray();
        System.out.println("Vamos con la matriz 1");
        matriz1.pedirTamanio();
        matriz1.rellenarArray();
        System.out.println("Vamos con la matriz 2");
        matriz2.pedirTamanio();
        matriz2.rellenarArray();
        int[][] a=matriz1.getMatriz();
        int[][] b= matriz2.getMatriz();
        if(a.length!=b.length||a[0].length!= b[0].length){
            System.out.println("No se pueden sumar porque son diferentes");
        }
    }
}
