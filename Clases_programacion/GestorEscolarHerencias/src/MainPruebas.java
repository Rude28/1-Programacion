import model.Alumno;
import model.Persona;
import model.Profesor;

public class MainPruebas {

    public static void main(String[] args) {
        System.out.println("Gestor escolar pruebas");
        Alumno alumno=new Alumno("Borja", "Martin",1234, "DAM");
        /*alumno.setNombre("Borja");
        alumno.setApellido("Martín");
        alumno.setMatricula(1234);
        alumno.setCurso("Primero");*/
        Profesor profesor=new Profesor("Jose","Juan", 2,2000);
        alumno.mostrarDatos(); //clase heredada y modificada con Numero de matricula y
        alumno.realizarExamen();//clase nueva
        alumno.saludar();//heredado de persona
        profesor.saludar();//heredado de persona
        profesor.corregirExamen();// propio de la clase profesor

        //puedo usar a persona vestido de alumno
        Persona alumno2=new Alumno();// este alumno esta bestido de persona y por lo tanto solo puede usar las
        //funcionadlidades de peresona

    }
}
