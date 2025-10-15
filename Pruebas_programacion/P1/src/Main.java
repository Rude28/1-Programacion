import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el numero de la izquierda de la operación");
            int numeroIzq=scanner.nextInt();
        System.out.println("Introduce el numero de la derecha de la operación");
            int numeroDer=scanner.nextInt();
        System.out.println("Selecciona la operacion");

        System.out.println("Suma 1 "+"Resta 2 "+"Multiplicacion 3 "+"Division 4 ");
            int numeroOperacion= scanner.nextInt();

        if (numeroOperacion == 1) {
           int operacionTotal= numeroIzq+numeroDer;
            System.out.println(operacionTotal);
        } else if (numeroOperacion == 2) {
            int operacionTotal= numeroIzq-numeroDer;
            System.out.println(operacionTotal);
        }
        else if (numeroOperacion == 3) {
            int operacionTotal= numeroIzq*numeroDer;
            System.out.println(operacionTotal);
        }else if (numeroOperacion == 4) {
            int operacionTotal= numeroIzq/numeroDer;
            System.out.println(operacionTotal);
        }
        else {
            System.out.println("Operacion no valida");
        }
    }
}
