package model;

public class Coche extends Vehiculo {
    private int nPuertas;

    public Coche(){}

    public Coche(String marca, String modelo, int nPuertas) {
        super(marca, modelo);
        this.nPuertas = nPuertas;
    }

    @Override
    public void conducir() {
        super.conducir();
        System.out.println("El coche tiene "+nPuertas+"de puertas");
    }
}
