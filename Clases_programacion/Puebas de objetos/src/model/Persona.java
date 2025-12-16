package model;

public class Persona {
    private String nombre;
    private String apellido;
    private String pelo;
    private int extremidades;
    private String arma;
    //Aquí tenemos creado el molde donde tenemos los diferentes elementos, antes instanciamos las cosas que porta
    public Persona (){}
    public Persona(String nombre, String apellido, String pelo, int extremidades, String arma) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.pelo=pelo;
        this.extremidades=extremidades;
        this.arma=arma;
    }
    public Persona(String nombre, String apellido, String pelo, int extremidades){
        this.nombre=nombre;
        this.apellido=apellido;
        this.pelo=pelo;
        this.extremidades=extremidades;
    }
}
