public class SentenciasSwitch {
public void usoSwitch(){
    int valor=3;
    String nombre;
    switch (valor){
    //Todas las variables que declaremos dentro, las vamos a poder ir usando pero lo mejor es tiparla fuera
        case 1:
            //cuando la variable toma valor de 1
            nombre="Borja";
            System.out.println("Toma valor de 1");
            break;
        case 5:
            //cuando la variable toma valor de 5
            nombre="Antoño";
            System.out.println("Toma valor de 5");
            break;
        case 7:
            //cuando la variable toma valor de 7
            System.out.println("Toma valor de 7");
            break;
        default:
            System.out.println("Valor no contemplado");
            //es como el else, se pone por si no entra nigun case

    }
}
public void usoSwitchStrings() {
    String nombre = null;
    switch (nombre.toUpperCase()) {
        //Para ignorar si son mayus o minus ponemos el .toUpperCase
        case "Borja":
            break;
        case "Antonio":
            break;
        case "Andres":
            break;
        default:
            System.out.println("Nombre no contemplado");
    }
}
public void usoSwitchChar() {
    char letra = 'A';
    switch (letra) {
        case 'A':
            break;
        case 'D':
            break;
        case 'B':
            break;
        default:
            System.out.println("Nombre no contemplado");
    }
}
public void usoSitchLanda(){
    int nota=7;
    switch (nota){
        case 1->{}
        case 2->{}
        case 3,4,5,6,7-> {
            System.out.println("Lo has conseguido");
        }
        default -> {
            System.out.println("Nada macho");
        }
    }
}
public void menuOpciones(){
    System.out.println("Indicame que quieres hacer");
}
}
//for es para hacer bucles, que algo pase x veces por un mismo sitio




