package model;

public abstract class Persona {
    private String nombre;
    private int edad;
    public Persona(){}

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void presentarse(){
        System.out.println("Hola me llamo " + nombre + " y tengo "+ edad+" años");

    }
}
