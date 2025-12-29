package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Comparator;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Carrera {
    private ArrayList<Coche> listaCoches;
    private int kilometrosCarrera;
    private String nombreCarrera;

    public void getListaCoches(Coche coche, Comparator<Coche> reversed) {
    }
}
