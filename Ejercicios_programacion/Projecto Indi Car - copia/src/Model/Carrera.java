package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Carrera {
    private ArrayList<Coche> listaCoches;
    private int kilometrosCarrera;
    private String nombreCarrera;
}
