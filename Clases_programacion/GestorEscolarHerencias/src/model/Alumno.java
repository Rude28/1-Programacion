package model;
/*heredamos de persona los metodos de saludar y el de mostrar datos. asi como los get y los set*/
public class Alumno extends Persona{

    private int matricula;

    private String curso;

    public Alumno(String nombre, String apellido, int matricula, String curso){
        //lo primero que tenemos que hacer es llamar a la superclase
        super(nombre, apellido);
        this.matricula=matricula;
        this.curso=curso;
    }



    //modificar metodos, muy importante el override para reescribir
    @Override
    public void mostrarDatos() {
        System.out.println("Numero de matricula" +getMatricula());
        super.mostrarDatos();//para que haga lo que hace el metodo de antes, aquí puede ir donde quieras
        System.out.println("El curso es" +getCurso());
    }
    // esta es la forma de rehacer los metodos
    @Override
    public void saludar() {
        System.out.println("Soy un alumno y voy a saludarte");
    }

    public void realizarExamen(){
        System.out.println("Vamos a realizar el examen");
        int nota=(int)(Math.random()*11);
        System.out.println("La nota del examen es "+ nota);
    }
    public  void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Alumno(){
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
