package Model;

public abstract class Figura {
    private int numero;
    public Figura(){}

    public Figura(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
