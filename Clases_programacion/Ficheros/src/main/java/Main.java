import java.io.File;

public class Main {
    public static void main(String[] args) {
        OperacionesFicheros operaciones=new OperacionesFicheros();
        operaciones.leerDatosFcichero();
        operaciones.leerHijos("src/main/java/resources/Ficheros");
        operaciones.crearFicheros("src/main/java/resources/Ficheros");
    }
}
