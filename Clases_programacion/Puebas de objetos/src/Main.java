import model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona atacante=new Persona("Antonio","Fernando Ramirez","Amarillo",4,"Espada");
        Persona npc=new Persona("Pepe", "Alferez Grande", "Amarillo",3);
        System.out.println(atacante);
        System.out.println(npc);
    }
}
