package Controller;
import Model.Carrera;
import Model.Coche;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
@Data
@NoArgsConstructor
public class CarreraController {
    private Carrera carrera;
    //Constructor

    public CarreraController(Carrera carrera) {
        this.carrera=carrera;
    }
    public void simuladorCarrera(int kmCarrera) {
        boolean terminarCarrea = false;
        while (!terminarCarrea) {
            for (int i = 0; i < carrera.getListaCoches().size(); i++) {
                int kmCoche = carrera.getListaCoches().get(i).getKilometrosRecorridosCoche();
                int kmAniadidos = (int) (Math.random() * 31) + 20;
                kmAniadidos += kmCoche;
                carrera.getListaCoches().get(i).setKilometrosRecorridosCoche(kmAniadidos);
                if (carrera.getKilometrosCarrera() <= carrera.getListaCoches().get(i).getKilometrosRecorridosCoche()) {
                    terminarCarrea = true;
                }
            }
        }
    }
    private void ordenarPilotosKilometros(Carrera carrera){
        carrera.getListaCoches().sort(Comparator.comparingInt(Coche::getKilometrosRecorridosCoche).reversed());
    }
    public void darPuntos(Carrera carrera){
        int puntos=10;
        ordenarPilotosKilometros(carrera);
        for (int i = 0; i < carrera.getListaCoches().size() && i<3; i++) {
            carrera.getListaCoches().get(i).setPuntos(puntos);
            puntos-=2;
        }
    }
    public void kmZero(){
        for (int i = 0; i < carrera.getListaCoches().size(); i++) {
            carrera.getListaCoches().get(i).setKilometrosRecorridosCoche(0);
        }
    }
    public void clasificacionGeneral(){
        System.out.println("Si quieres ver la clasificacion de la carrera pulsa 1");
        System.out.println("Si quieres ver la clasificacion general pulsa 2");
        System.out.println("si quieres saltar a la siguiente carrera pulsa 3");
        Scanner scanner=new Scanner(System.in);
        int numeroEntrada=scanner.nextInt();
        int puntos=10;
        switch (numeroEntrada){
            case 1-> {
                for (int i = 0; i < carrera.getListaCoches().size(); i++) {
                    if (i < 3) {
                        System.out.println("El coche de "+carrera.getListaCoches().get(i).getNombreCoche()+
                                " ha recorrido "+carrera.getListaCoches().get(i).getKilometrosRecorridosCoche()+
                                " y ha ganado los siguientes puntos:"+ puntos);
                        puntos-=2;
                    }else {
                        System.out.println("El coche de " + carrera.getListaCoches().get(i).getNombreCoche() +
                                " ha recorrido " + carrera.getListaCoches().get(i).getKilometrosRecorridosCoche());
                    }
                }
            }
            case 2-> {
                ordenarPilotosPuntos(carrera);
                for (int i = 0; i < carrera.getListaCoches().size(); i++) {
                    System.out.println("El "+(i+1)+
                            " del campeonato es "+carrera.getListaCoches().get(i).getNombreCoche()+
                            "Con los puntos: " +carrera.getListaCoches().get(i).getPuntos());
                }
            }
            case 3->{}
        }

    }
private void ordenarPilotosPuntos(Carrera carrera){
        carrera.getListaCoches().sort(Comparator.comparingInt(Coche::getPuntos).reversed());
}
public void clasificacionFinal(){
    //Arreglar clasificacion final
    ordenarPilotosPuntos(carrera);
    System.out.print("--- Clasificación final --- \n");
    ArrayList<Coche> lista2Coches=new ArrayList<>();
    ordenarPilotosKilometros(carrera);
    for (int i = 0; i < carrera.getListaCoches().size(); i++) {
        System.out.println("El "+(i+1)+" del campeonato es "+carrera.getListaCoches().get(i).getNombreCoche()+
                "Con los puntos: "+carrera.getListaCoches().get(i).getPuntos());
    }
}
}