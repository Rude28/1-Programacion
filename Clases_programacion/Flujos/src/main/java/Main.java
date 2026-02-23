import controller.GestorFicheros;

public class Main {
    public static void main(String[] args) {
        GestorFicheros gestorFicheros=new GestorFicheros();
        //gestorFicheros.crearFichero("src/main/java/Recursos/lectura.txt");
        //gestorFicheros.crearCarpeta("src/main/java/Recursos/cosa/ejemplo");
        gestorFicheros.lectorFicheros("src/main/java/Recursos/lectura.txt");
    }
}
