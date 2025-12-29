package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Alumno {//el construcror se debe de llamar igual a la clase
    private Asignatura asignatura1, asignatura2, asignatura3;
    public Alumno(int id1,int id2,int id3){
        //TODO
        this.asignatura1=new Asignatura(id1);
        this.asignatura2=new Asignatura(id2);
        this.asignatura3=new Asignatura(id3);
    };
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1=asignatura1;
        this.asignatura2=asignatura2;
        this.asignatura3=asignatura3;
    }
}
