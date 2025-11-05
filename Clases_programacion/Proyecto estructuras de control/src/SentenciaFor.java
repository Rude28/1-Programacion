public class SentenciaFor {
    public void sentenciaFor(){
        //se escribe con inicial;final;incrementa
        for(int i=0; i<4;i+=1){
            System.out.println("Numero" + 1);
        }
    }
    public void sentenciaDescendienteFor(){
        for (int i = 100; i >0 ; i--) {// va del cien al cero
            System.out.println("Decreciente " + i);
        }
    }
    public void sentenciaAscendienteFor(){
        for (int i = 0; i < 10; i++) { //Llega hasta diez

        }
    }
    public void dibujarCuadrado(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                if (i == 0 || i == 4) {
                    System.out.println("*");
                } else if (j == 0 || j == 4) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
    //sacar cada una de las letras de la palabra
    public void letra(){
        String frase= "hola que tal estas";
        System.out.println(frase.charAt(0));
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }
    //marchar al reves en una frase
    public void recorrerAlReves(){
        String frase="allí ves ssevilla";
        for (int i = frase.length()-1; i>=0  ; i--) {
            System.out.println(frase.charAt(i));
        }
    }
    //Encolntrar palindromo
    //Vamos hasta la mitad de la frase
    public void palindromo(){
        String frase="allí ves ssevilla";
        frase=frase.replaceAll(" ","");
// con esta funcion de string nos cargamos los espacios y los sustitoimos por nada(primeras comillas y segundas comillas)
        boolean esPalindromo=true;
        for (int i =0; i>=frase.length()/2  ; i++) {
            System.out.println(frase.charAt(i));
            char letraUno=frase.charAt(i);
            char letraDos=frase.charAt(frase.length()-1-i);
            if (letraUno == letraDos) {
                esPalindromo=false;
                break;
            }
        }
    }
    public void calcularFactorial(){
//ejercicio 8 de ejercicios
    }
    public void recorrerColecion() {
        //esto es un array
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);//lo hacemos asi para aceder a cada una de las posiciones
        }
        //ahora lo vamos a hacer con un for each, y sirve para recorrer un array
        //no necesita incremento porque lo estamos mandando recorrer
        for (int item : numeros) {
            System.out.println(item);
        }
    }
    // while y do while
    // repiten un bloque de codigo dependiendo de una condicion que tiene como resultado un bool
    // si la concicion es tru se vuelve a jecutar el bloque


}
