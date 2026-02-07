public class LlamadaLocal extends Llamadas{

    public LlamadaLocal(){}
    public LlamadaLocal (long nOrigen, long nDestino, int duracion){
        super(nOrigen,nDestino,duracion);
    }
    @Override
    public void calcularCoste(){
        setCoste(0);
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Llamada local");
        super.mostrarDatos();
    }
}
