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
        Scanner scanner=new Scanner(System.in);
        int numeroEntrada=0;
        do {
        System.out.println("================== MENÚ DEL CAMPEONATO ==================");
        System.out.println("= Si quieres ver la clasificacion de la carrera pulsa 1 =");
        System.out.println("==== Si quieres ver la clasificacion general pulsa 2 ====");
        System.out.println("==== Si quieres saltar a la siguiente carrera pula 3 ====");
        int puntos=10;
        numeroEntrada=scanner.nextInt();
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
            case 3->{
                System.out.println("Saliendo de la carrera");
            }
            default -> {
                System.out.println("El numero introducido debe ser 1 2 o 3");
                System.out.println("  ");
            }

        }
        }while (numeroEntrada!=3);

    }
    public void clasificacionFinal(){
        System.out.println("=========== Clasificacion final del campeonato ===========");
        ordenarPilotosPuntos(carrera);
        compararEmpatesPuntos(carrera);
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
    private void ordenarPilotosKilometros(Carrera carrera){
        carrera.getListaCoches().sort(Comparator.comparingInt(Coche::getKilometrosRecorridosCoche).reversed());
        compararEmpatesKilometros(carrera);
    }
    private ArrayList compararEmpatesKilometros(Carrera carrera){
        int i=0;
        while (i< carrera.getListaCoches().size()) {
            ArrayList<Coche> bloqueComparado = new ArrayList<>();
            Coche cocheComparado = carrera.getListaCoches().get(i);
            bloqueComparado.add(cocheComparado);
            int kmActual = carrera.getListaCoches().get(i).getKilometrosRecorridosCoche();
            int j = i + 1;
            while (j < carrera.getListaCoches().size() &&
                    kmActual == carrera.getListaCoches().get(j).getKilometrosRecorridosCoche()) {
                bloqueComparado.add(carrera.getListaCoches().get(j));
                j++;
            }
            if (bloqueComparado.size() > 1) {
                bloqueComparado.sort(
                        Comparator.comparingDouble(Coche::getMejorVuelta)
                );
                System.out.println(
                        "Hay un empate entre coches con " + kmActual +
                                " km. Se decide por la mejor vuelta."
                );
                for (int k = 0; k < bloqueComparado.size(); k++) {
                    carrera.getListaCoches().set(i + k, bloqueComparado.get(k));
                }
            }
            i = j;
        }
        return carrera.getListaCoches();
    }
    private void ordenarPilotosPuntos(Carrera carrera){
        carrera.getListaCoches().sort(Comparator.comparingInt(Coche::getPuntos).reversed());
}

    private ArrayList compararEmpatesPuntos(Carrera carrera){
        int i=0;
        while (i< carrera.getListaCoches().size()) {
            ArrayList<Coche> bloqueComparado = new ArrayList<>();
            Coche cocheComparado = carrera.getListaCoches().get(i);
            bloqueComparado.add(cocheComparado);
            int puntosActual = carrera.getListaCoches().get(i).getPuntos();
            int j = i + 1;
            while (j < carrera.getListaCoches().size() &&
                    puntosActual == carrera.getListaCoches().get(j).getPuntos()) {
                if (bloqueComparado.size() > 1) {
                    bloqueComparado.sort(
                            Comparator.comparingDouble(Coche::getMejorVuelta)
                    );
                    System.out.println(
                            "Hay un empate entre coches con " + puntosActual +
                                    " km. Se decide por la mejor vuelta final."
                    );
                    for (int k = 0; k < bloqueComparado.size(); k++) {
                        carrera.getListaCoches().set(i + k, bloqueComparado.get(k));
                    }
                }
            }
            i=j;
        }
        return carrera.getListaCoches();
    }
}