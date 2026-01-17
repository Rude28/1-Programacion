package model;

public class Profesor extends Persona{
    private int experiencia;
    private int salario;
    public Profesor(){}

    public Profesor(String nombre, String apellido, int experiencia, int salario){
        super(nombre, apellido);
        this.experiencia=experiencia;
        this.salario=salario;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Te digo el salario "+salario);
        System.out.println("Te digo la experiencia "+experiencia);
    }
    public void corregirExamen(){
        System.out.println("Corrigiendo examen");
    }
    @Override
    public void saludar() {
        System.out.println("Soy un profesor y voy a saludarte");
    }
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
