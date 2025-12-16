import lombok.Getter;
import model.Coche;
public class Main {
    public static void main(String[] args) {
        // el main es statico porque solo se puede acceder directamente y que es un elemento que pertenece
        //a la clase no al objeto
        //Clases son el molde de lo que va a ser el objeto, cuando creamos una clase es un tipo de dato
        Coche ford=new Coche();//"el new Coche();" es el enlace con el constructor
        //aqui vamos a crear un objeto ford que tiene el molde coche y que es un nuevo cohce
        //lo tenemos que importar ya que lo tenemos en un paquete
        // variables lo que cualifica
        Coche opel=new Coche("Opel","Astra","Grande","Rojo",150);

    }
}
