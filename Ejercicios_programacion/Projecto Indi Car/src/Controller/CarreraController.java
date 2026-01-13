package Controller;
import Model.Carrera;
import Model.Coche;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Scanner;
@Data
@NoArgsConstructor
public class CarreraController {
    private Carrera carrera;
    public CarreraController(Carrera carrera) {
        this.carrera=carrera;
    }
    public void simuladorCarrera(int kmCarrera) {
        boolean terminarCarrea = false;
        while (!terminarCarrea) {
            for (int i = 0; i < carrera.getListaCoches().size(); i++) {
                int kmCoche = carrera.getListaCoches().get(i).getKilometrosRecorridosCoche();
                int kmAniadidos = (int) (Math.random() * 31) + 20;
                carrera.getListaCoches().get(i).setMejorVuelta(acumularVuelta(kmAniadidos));
                kmAniadidos += kmCoche;
                carrera.getListaCoches().get(i).setKilometrosRecorridosCoche(kmAniadidos);
                if (kmCarrera <= carrera.getListaCoches().get(i).getKilometrosRecorridosCoche()) {
                    terminarCarrea = true;
                }
            }
        }
    }
    public void darPuntos(Carrera carrera){
        int puntos=10;
        int puntosCoche=0;
        ordenarPilotosKilometros(carrera);
        for (int i = 0; i < carrera.getListaCoches().size() && i<3; i++) {
            puntosCoche=getCarrera().getListaCoches().get(i).getPuntos();
            puntosCoche+=puntos;
            carrera.getListaCoches().get(i).setPuntos(puntosCoche);
            puntos-=2;
        }
    }
    public void kmZero(){
        for (int i = 0; i < carrera.getListaCoches().size(); i++) {
            carrera.getListaCoches().get(i).setKilometrosRecorridosCoche(0);
        }
    }
    public void clasificacionGeneral(){
        Scanner addDatos=new Scanner(System.in);
        int numeroEntrada=0;
        do {
        System.out.println("================== MENÚ DEL CAMPEONATO ==================");
        System.out.println("= Si quieres ver la clasificacion de la carrera pulsa 1 =");
        System.out.println("==== Si quieres ver la clasificacion general pulsa 2 ====");
        System.out.println("==== Si quieres saltar a la siguiente carrera pula 3 ====");
        int puntos=10;
        while(!addDatos.hasNextInt()){
            System.out.println("Eso no es un número entero. Inténtalo de nuevo");
            addDatos.next();
        }
        int addEnteros=addDatos.nextInt();
        //Meter autentificador de entrada
        switch (numeroEntrada){
            case 1-> {
                System.out.println("================ Clasificaición carrera =================");
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
                System.out.println(" ");

            }
            case 2-> {
                ordenarPilotosPuntos(carrera);
                System.out.println("========== Clasificacion general del campeonato ==========");

                for (int i = 0; i < carrera.getListaCoches().size(); i++) {
                    System.out.println("El "+(i+1)+
                            " del campeonato es "+carrera.getListaCoches().get(i).getNombreCoche()+
                            " con los puntos: " +carrera.getListaCoches().get(i).getPuntos());
                }
                System.out.println(" ");

            }
            case 3->
                System.out.println("Saliendo de la carrera");

            default -> {
                System.out.println("El numero introducido debe ser 1 2 o 3");
                System.out.println("  ");
            }

        }
        } while (numeroEntrada!=3);
    }
    public void clasificacionFinal(){
        System.out.println("=========== Clasificacion final del campeonato ===========");
        ordenarPilotosPuntos(carrera);
        for (int i = 0; i < carrera.getListaCoches().size(); i++) {
            System.out.println("El "+(i+1)+" del campeonato es "+carrera.getListaCoches().get(i).getNombreCoche()+
                    " con los puntos: "+carrera.getListaCoches().get(i).getPuntos());
        }
    }
    private int acumularVuelta(int kmRecorridos){
        int mejorkm=0;
        if (mejorkm<kmRecorridos){
            mejorkm=kmRecorridos;
        }
        return mejorkm;
    }

    private ArrayList ordenarPilotosKilometros(Carrera carrera){

        for (int i = 0; i < carrera.getListaCoches().size()-1; i++) {
            for (int j = 0; j < carrera.getListaCoches().size()-1 -i; j++) {
                int puntosActual= carrera.getListaCoches().get(j).getKilometrosRecorridosCoche();
                int puntosSiguiente=carrera.getListaCoches().get(j+1).getKilometrosRecorridosCoche();
                boolean intercambio=false;
                if (puntosActual<puntosSiguiente){
                    intercambio=true;
                } else if (puntosActual==puntosSiguiente) {
                    int masKilometros=carrera.getListaCoches().get(j).getKilometrosRecorridosCoche();
                    int menKilomentros=carrera.getListaCoches().get(j+1).getKilometrosRecorridosCoche();
                    if (masKilometros>menKilomentros){
                        intercambio=true;
                    }
                    System.out.println("Hay un empate de puntos, el mejor se decide por la mejor vuelta");
                }

                if (intercambio) {
                    Coche auxiliar=carrera.getListaCoches().get(j);
                    carrera.getListaCoches().set(j,carrera.getListaCoches().get(j + 1));
                    carrera.getListaCoches().set(j+1,auxiliar);
                }
            }
        }
        return carrera.getListaCoches();
    }

    private ArrayList ordenarPilotosPuntos(Carrera carrera){
        for (int i = 0; i < carrera.getListaCoches().size()-1; i++) {
            for (int j = 0; j < carrera.getListaCoches().size()-1 -i; j++) {
                int puntosActual= carrera.getListaCoches().get(j).getPuntos();
                int puntosSiguiente=carrera.getListaCoches().get(j+1).getPuntos();
                boolean intercambio=false;
                if (puntosActual<puntosSiguiente){
                    intercambio=true;
                } else if (puntosActual==puntosSiguiente) {
                    int masKilometros=carrera.getListaCoches().get(j).getKilometrosRecorridosCoche();
                    int menKilomentros=carrera.getListaCoches().get(j+1).getKilometrosRecorridosCoche();
                    if (masKilometros>menKilomentros){
                        intercambio=true;
                    }
                    System.out.println("Hay un empate de puntos, el mejor se decide por la mejor vuelta");
                }

                if (intercambio) {
                    Coche auxiliar=carrera.getListaCoches().get(j);
                    carrera.getListaCoches().set(j,carrera.getListaCoches().get(j + 1));
                    carrera.getListaCoches().set(j+1,auxiliar);
                }
            }
        }
        return carrera.getListaCoches();
    }
}