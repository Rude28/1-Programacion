package model;

public class Estudiante extends Persona {
    private int curso;

    public Estudiante() {}

    public Estudiante(int edad, String nombre, int curso) {
        super(edad, nombre);
        this.curso = curso;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Estoy estudiando "+curso+" de DAM");
    }
}
