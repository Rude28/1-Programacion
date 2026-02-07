public abstract class Llamadas {
    private long nOrigen, nDestino;
    private int duracion;
    private double coste;

    public Llamadas() {
    }

    public Llamadas(long nOrigen, long nDestino, int duracion){
        this.nOrigen=nOrigen;
        this.nDestino=nDestino;
        this.duracion=duracion;
        // coste=0
    }
    public abstract void calcularCoste();
    public long getnOrigen(){
        return nOrigen;
    }
    public void mostrarDatos(){

    }

    public void setnOrigen(long nOrigen) {
        this.nOrigen = nOrigen;
    }

    public long getnDestino() {
        return nDestino;
    }

    public void setnDestino(long nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}
