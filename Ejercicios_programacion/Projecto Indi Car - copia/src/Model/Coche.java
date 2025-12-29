package Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coche {
    private String nombreCoche;
    private int dorsal;
    private int kilometrosRecorridosCoche;
    private int puntos;
    private int mejorVuelta;
}

