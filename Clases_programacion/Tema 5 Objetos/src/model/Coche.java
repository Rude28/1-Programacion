package model;
import lombok.*;

//@Getter
//@Setter
//con esto nos evitamos escribir todos los getter y los setter
@Data
//con arroba data importamos todos los getter y todos los setter
@NoArgsConstructor
// con este contruimos el args sin datos automaticamente
@AllArgsConstructor
// con este contruimos el args con todas las variables
public class Coche {
    private String  matricula;
    private String  marca;
    private String  modelo;
    private String  bastidor;
    private String  color;
    public int cv;

// lo ponemos privado para que solo se pueda acceder desde este metodo Coche
// si lo hacemos pulico podemos acceder desde todas las partes
// con los mteotods hacemos aquellas funcionalidades que indican como puede trabajar el futuro obeto
// existen los metodos constructores que inicializan el objeto,
/* en toda clase existe un constructor que esta vacio y que nos permite inicializarlo sin nada
 puvlic Coche(){cuerpo}; este se enmascara cuando creamos ostro constructor, es recomendable siempre escribirlo
 */
/* al inicializar en el mein un Coche estamos creando un coche que tieen todos los datos que hemos metido
(mattricula, marca ...) vacios, osea =null; para poder acceder a ellos debemos de crear un constrctor

    public Coche() {
        System.out.println("Vamos a construir un coche");
    }
    */
/* Si desde el main no damos ningun valor se inicia el vacio (el de arriba), pero si le damos las strings que nos pide
nos da el de abajo
*/
// entre corchetes podnemos que cualifica a el objeto
    public Coche(String marca, String modelo, String bastidor, String color, int cv){
        this.marca=marca;// así referenciamos la marca de arriba a la marcad del inicializador coche
        this.cv=cv;
        this.modelo=modelo;
        this.bastidor=bastidor;
        this.color=color;
    }
//metodos getter y setter sirven para coger algo o para poner algo
    //para generarlos todos damos alt+inter(tambien funcion en portatil)y le damos a generar getter y setter automaticamente
    // para los boolean nos lo va a poner como isvariable
/*
    public int getCv(){
        return cv;// si ponemos el this.cv no nos falta pero ni nos sobra
    }
    public void setCV(){
        this.cv+=cv;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }*/
    //metodo to String es el que nos permite de forma grafica el objeto
    public String toString(){
        return super.toString();
    }

}
