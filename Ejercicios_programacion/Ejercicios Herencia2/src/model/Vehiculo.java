package model;

public abstract class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void conducir(){
        System.out.println("Se empieza a conducir"+marca+modelo);
    }
}
