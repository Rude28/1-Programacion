import model.Alumno;
import model.Asignatura;

public class Main {
    public static void main(String[] args) {
    Asignatura programacion=new Asignatura(1);
    Asignatura sistemas=new Asignatura(2);
    Asignatura marcas=new Asignatura(3);
    Alumno borja=new Alumno(1,2,3);
    Alumno celia=new Alumno(programacion,sistemas,marcas);

    }

    //primero debemos de crear un paquete que sea model donde meteremos las clases
    // despues una carpeta de resource donde meteremos las librerias externas
}
