import java.util.Scanner;

public class Bonolo {
    private int[] numeroSistema=new int[5];
    private int[] numeroUsuario=new int[5];
    //todos los array fuera del mein hay que marcarlos como privados x seguridad
    int aciertos= 0;
    private Scanner scanner= new Scanner(System.in);
    public void iniciaJuego(){
        for (int i = 0; i < 5; i++) {
            numeroSistema[i]=(int)(Math.random()*21);
        }
        System.out.println("Procedemos a sellar tu boleto");
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero con el que quieres jugar");
            int numeroIntroducido;
            do {
                System.out.println("Introduce el numero con el que quieres jugar");
                numeroIntroducido=scanner.nextInt();
                if (numeroIntroducido<0|| numeroIntroducido>20){
                    System.out.println("Incorrecto");
                }
            }while(numeroIntroducido<0|| numeroIntroducido>20);
            numeroUsuario[i] =numeroIntroducido;
        }
        System.out.println("Procedemos a ver las conincidencias del sistema");
        for (int item: numeroUsuario) {
            buscarNumero(item);
        }
        System.out.println("Has acertado"+ aciertos);
    }
    public void buscarNumero(int numero){
        /* buscar un numero dentro del array numeros sistema
        numerosSistema-> variable clase
        numero->parametro
        */
        for (int item : numeroSistema) {
            if (item==numero){
                aciertos++;
                break;
            }
        }
    }
    public void listarNumeroSistema(){
        System.out.println("Los numeros del sistema son:");
        for (int item : numeroSistema) {
            System.out.println(numeroSistema[item]);
        }
    }
    public void listarNumeroUsuario(){
        System.out.println("Los numeros del sistema son:");
        for (int item : numeroUsuario) {
            System.out.println(numeroUsuario[item]);
        }
    }

}
