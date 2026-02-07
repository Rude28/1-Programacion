import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno>alumnos=new ArrayList<>();
        Alumno alumno4=new Alumno("Mercedes", "Perez", "13616g");
        alumnos.add(new Alumno("Borja","Martin","12521f", 8));
        alumnos.add(new Alumno("Maria","Torres","68424g"));
        alumnos.add(new Alumno("Pepe","Rios","43551h"));
        alumnos.add(new Alumno("Mercedes", "Perez", "13616g"));
        for (Alumno item : alumnos){
            item.mostrarDatos();
        };

        /*
        * las funciones de flecha o lamnda se llaman de spues de ostra funciones
        * param> cuerpo
        * las podemos o hacer nosotros o que ya esten hechas
        * tras la llamada a la funcion foreach se llama en cada iteraccion(en todos los elementos del array) a
        * la funcion de flecha definida en los parametros*/
        //alumnos.forEach(element -> element.mostrarDatos());
        /*alumnos.forEach(elment->{
            System.out.println("Vamos a imprimir llos datos de "+elment.getNombre());
            elment.mostrarDatos();
        });*/
        /*
        * Aqui no nos hace falta el parametro ya que al haber solo uno nos da igual y porque es un metodo
        * de acceso directo*/
        alumnos.forEach(Alumno::mostrarDatos);
        //Con esto lo que hago es recorrer alumnos e ir cogiendo sus notas e ir imprimiendo las notas
        alumnos.stream().map(Alumno::getNota).forEach(System.out::println);
        // Ahora nos podemos hacer nuestras funciones flechas llamadas bifuncion
        // Los dos primeros se suman y el tercero es el parametro que devuelve
        BiFunction<Integer,Integer,Integer> funcionMulti=(p1,p2)->p1*p2;

        alumnos.stream().map(Alumno::getNota).forEach(nota-> System.out.println(funcionMulti.apply(nota,2)));

    }

}
