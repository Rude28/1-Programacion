package Controller;

import Model.Campeonato;
import Model.Carrera;
import lombok.Data;

import java.util.ArrayList;
@Data

public class CampeonatoController {
private Campeonato campeonato;
//Constructor
    public CampeonatoController(Campeonato campeonato) {
        this.campeonato=campeonato;
    }
    public void iniciarCampeonato(){
        for (int i = 0; i <campeonato.getListaCarreras().size(); i++) {
            System.out.printf("--- Iniciando la carrera %d %s --- %n",(i+1),campeonato.getListaCarreras().get(i).getNombreCarrera());
            int kmCarrera=campeonato.getListaCarreras().get(i).getKilometrosCarrera();
            CarreraController carreraController=new CarreraController(campeonato.getListaCarreras().get(i));
            carreraController.simuladorCarrera(kmCarrera);
            carreraController.darPuntos(campeonato.getListaCarreras().get(i));
            carreraController.clasificacionGeneral();
            carreraController.kmZero();
            if ((campeonato.getListaCarreras().size()-1) == i) {
                carreraController.clasificacionFinal();
            }
        }
    }
}