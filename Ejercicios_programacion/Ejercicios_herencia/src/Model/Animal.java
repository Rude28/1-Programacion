package Model;

import java.net.Socket;

public abstract class Animal {
    private String nombre;
    private String edad;
    public  Animal(){}

    public Animal(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hacerSonido(){
        System.out.println("Animal: " +nombre+", edad "+ edad+"años");
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
