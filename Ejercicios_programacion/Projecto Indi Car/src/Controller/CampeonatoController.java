package Controller;

import Model.Campeonato;
import lombok.Data;

@Data

public class CampeonatoController {
private Campeonato campeonato;
//Constructor
    public CampeonatoController(){   }
    public CampeonatoController(Campeonato campeonato) {
        this.campeonato=campeonato;
    }
    public void iniciarCampeonato(Campeonato campeonato){
        int i=0;
        for ( i = 0; i <campeonato.getListaCarreras().size(); i++) {
            CarreraController carreraController=new CarreraController(campeonato.getListaCarreras().get(i));
            int kmCarrera=campeonato.getListaCarreras().get(i).getKilometrosCarrera();
            carreraController.simuladorCarrera(kmCarrera);
            carreraController.darPuntos(campeonato.getListaCarreras().get(i));
            System.out.printf(" Iniciando la carrera: %d %s %n",
                    (i+1),campeonato.getListaCarreras().get(i).getNombreCarrera());
            carreraController.clasificacionGeneral();
            carreraController.kmZero();
            retardo();
            if (campeonato.getListaCarreras().size() -1 == i) {
                carreraController.clasificacionFinal();
            }
        }
    }
    public void retardo(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("...");
        System.out.println(" ");

    }
}