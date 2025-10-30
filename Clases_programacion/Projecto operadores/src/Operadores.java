public class Operadores {
    public void operadoresAritmeticos() {
        int operandoUno = 0;
        //incremento
        operandoUno++;
        System.out.println("El valor de operando 1 es " + operandoUno);
        //decremento
        operandoUno--;
        //operadores binarios, suma(+) resta(-) multi(*) div(/) modolo de division (%)
        operandoUno = 5;
        int operandoDos = 4;
        int suma = operandoUno + operandoDos
        System.out.println("El resultado de la suma es" + suma);
        System.out.println("Aqui me aparecen los dos numeros a la vez  sin sumar" + operandoUno + operandoDos);
        System.out.println("Aqui hago la suma gracias al parentesis" + (operandoUno + operandoDos));
        double division =/* hacemos esto para que los numeros enteros pasen a double momentaneamente*/(double) operandoUno / operandoDos;
        // si no lo hacemos nos da el resultado de 1.0
        System.out.println("El resultado de la division es" + division);
        // a esto se le llama castear y se puede hacer con numeros, pero no de letras a numeros

    }

    public void operadoresAsignacion() {
        int operadorUno = 5;
        int operadorDos = 10;
        //operadorUno= operadorUno+operadorDos;// esto es igual a lo siguiente
        operadorUno += operadorDos;
        operadorUno += 2;
        operadorUno -= 2;
        operadorUno *= 2;
        operadorUno /= 2;
    }

    public void operadoresComparacion() {// da como resultado de una comparacion siempre es tru o false
        int operadorUno = 5;
        int operadorDos = 10;
        //>mayor
        //>= mayor o igual que
        //< menor que
        //<=menor o igual que
        //==igual que
        //&& y para conectar dos comparaciones
        //|| para dar dos opciones para comparadores

    }
}