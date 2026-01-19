package Model;

public class Gato extends Animal{
    private String sonido;
    public Gato(){}
    public Gato(String nombre,String edad, String sonido){
        super(nombre,edad);
        this.sonido=sonido;
    }
    @Override
    public void hacerSonido() {
        sonido="miau";
        super.hacerSonido();
        System.out.println("El gato hace "+ sonido);
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
