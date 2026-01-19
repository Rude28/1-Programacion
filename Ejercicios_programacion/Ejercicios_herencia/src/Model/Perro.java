package Model;

public class Perro extends Animal{
    private String sonido;
    public Perro(){}

    public Perro(String sonido) {
        this.sonido = sonido;
    }

    public Perro(String nombre, String edad, String sonido) {
        super(nombre, edad);
        this.sonido = sonido;
    }
    @Override
    public void hacerSonido() {
        sonido="guau";
        super.hacerSonido();
        System.out.println("El perro hace "+ sonido);
    }
}
