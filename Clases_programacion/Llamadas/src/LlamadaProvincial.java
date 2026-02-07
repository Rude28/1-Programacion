public class LlamadaProvincial extends Llamadas{

    private final double CosteSeg=15;
    public LlamadaProvincial() {
    }

    public LlamadaProvincial(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public void calcularCoste() {
        setCoste(getDuracion()*CosteSeg);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada provincial");
        super.mostrarDatos();
    }
}
