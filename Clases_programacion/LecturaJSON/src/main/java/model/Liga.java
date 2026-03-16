package model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Liga implements Serializable {
    // para que funcionen tienen que ser igales a los de las api para que el mapeador cree la conversion completa
    private String idLeague,strLeague,strSport;

    @Override
    public String toString() {
        return String.format("%s - %s",idLeague,strLeague);
    }
}
