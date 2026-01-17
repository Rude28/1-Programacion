package model;

public abstract class Persona {

    private String nombre, apellido;
    public Persona(){}
    // TODO me olvido del constructor vacio-> más adelante
    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(apellido);
    }

    //así obligamos a que los que heredan hagan esto con el abstract y cargandonos el cuerpo(osea estos simbolos
    // y lo de dentro{})

    public abstract void saludar();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
