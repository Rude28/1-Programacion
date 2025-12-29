package Controller;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CarreraController {
    private CampeonatoController campeonatoController;
    private int kilometrosGanador;
    //Constructor
    public CarreraController(){
        SimularCarrera();
    }
//Funcionalidades
    private void SimularVuelta() {
        int tamanio=campeonatoController.getListaCoches().size();
        this.campeonatoController=campeonatoController;
        for (int i = 0; i < tamanio; i++) {
            int kilometro = (int) (Math.random() * 31) + 20;
            int kilometrosCoche = campeonatoController.getListaCoches().get(i).getKilometrosRecorridosCoche();
            kilometro += kilometrosCoche;
            campeonatoController.getListaCoches().get(i).setKilometrosRecorridosCoche(kilometro);
        }
    }
    private void EncontrarGanadorVuelta(){
        int tamanio=campeonatoController.getListaCoches().size();
        kilometrosGanador=campeonatoController.getListaCoches().get(0).getKilometrosRecorridosCoche();
        for (int i = 0; i < tamanio; i++) {
            int kilometrosCoche2=campeonatoController.getListaCoches().get(i).getKilometrosRecorridosCoche();
            if (kilometrosGanador<kilometrosCoche2){
                kilometrosGanador=kilometrosCoche2;
            }
        }
    }
    public void SimularCarrera(){
        SimularVuelta();
        if (kilometrosGanador<campeonatoController.getListaCarreras().get(0).getKilometrosCarrera());{
            SimularVuelta();
        }
        EncontrarGanadorVuelta();
        System.out.println("los kilometros del ganador son"+kilometrosGanador);
    }
}
