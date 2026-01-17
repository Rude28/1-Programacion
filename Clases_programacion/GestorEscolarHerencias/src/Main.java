import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;

/*Clase->molde de un futuro objeto
    atributos   ->cualifican al futuro objeto
                ->siempre son privados
    contructores-> funcion que permite crear el objto. Minimo1 (si escribo uno enmascaro al vacio).
    Siempre son public(sin retorno)
    metodos     -> funcionalidades del objeto futuro -> public protected private


herencia    -> algo que me dan ya hecho
            -> todos los elementos no privados de una clase pasan a una  clase hija
            -> los contructores nose pasan en herencia, pero puedo nombrarlos
            -> para eso utilizo la palabra privada super
            -> todos los metodos que se heredan pueden ser sobrescritos / modificados
            -> cuando creamos una linea de herencia una subclase solo puede heredar de una superclase
            -> para poder indicar la línea de herencia se utiliza la palabra extends
            -> la herencia permite que un objeto tenga varias formas:  POLIMORFISMO (Si soy castellano tengo
            caracteristicas de castellano y de español)
            -> las clases abstract se usan para marcar superclases ya que no se pueden usar, son un ente
            -> cuando accdemos desde una herencia a otra herencia anterior con datos modificados, vemos los datos
            modificados
            -> las subclases de las superclases deben de tener siempre almenos un constructor que conincida de arriba a
            abajo
            -> para usar la super clase podemos vestir a una subclase de super clase
            Persona(superclase) alumno=new Alumno; (clase inferior)
            -> con el abstract en los metodos de la superclase obligamos a todas subclases a que lo inicialicen con la
            misma firma
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor escolar");
        Alumno alumno1=new Alumno("jose","pedro",1234,"DAM");
        Alumno alumno2=new Alumno("Lu","pedro",1234,"DAM");
        Alumno alumno3=new Alumno("Le","pedro",1234,"DAM");
        Alumno alumno4=new Alumno("Al","pedro",1234,"DAM");
        Profesor profesor1=new Profesor("jose","pedro",1234,12345);
        Profesor profesor2=new Profesor("asd","pedro",1234,12345);
        Profesor profesor3=new Profesor("asds","pedro",1234,12345);
        Profesor profesor4=new Profesor("jogdgsse","pedro",1234,12345);


        //Dentro del arraylist podemos meter todas su subclases
        ArrayList<Persona> listaPersonas=new ArrayList<>();

        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);

        // al recorrer la lista persona y pedir que en cada una vaya por en un metodo este le da por el camino suyo
        for(Persona persona: listaPersonas){
            persona.mostrarDatos();
            //
            if (persona instanceof Alumno) {
                ((Alumno) persona).realizarExamen();
            }
            if (persona instanceof Profesor) {
                ((Profesor) persona).corregirExamen();

            }
        }
    }
}
