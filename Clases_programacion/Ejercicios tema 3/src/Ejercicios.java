import java.util.Scanner;

public class Ejercicios {
    Scanner entradaDatos;
    public void ejercicio1(){
    Scanner scanner= new Scanner(System.in);
        System.out.println("Indica la frase qe quieres analizar");
        String frase= scanner.nextLine();
        //esti es solo una frase. Esta es la segunda
        System.out.println("La frase es"+frase);
        String[] frases=frase.split("\\.");
        String fraseLetras= frase.replaceAll(",", "").replaceAll(".","").replaceAll(" ","");
        String frasePalabras= frase.replaceAll("\\."," ").replaceAll(","," ");
        String [] palabras=frasePalabras.split(" ");
        System.out.println("El numero de oraciones es"+ frases.length);
        System.out.println("El numero de letras es "+ fraseLetras.length());

        /* Queremos ver la longitud de la frasecon, primero creamos una array de tipo string con [] esta funcionalidad
        del metodo String tenemos el split,que sirve para indicar por donde queremos cortar la frase, debemos de
        indicarlos despues del regex.
        Pra ver cuantas letras tenemos quitamos los comas, los puntos y los espacios por nada con el metodo replaceAll
        donde marcamos el regex(lo que vamos a sustituir) por (replacement, lo que sustituimos).
        Por último mostramos la longitud de frasePalabras con el .length() que es el metodo de string que nos permite ver
        la longitud de un strign en este caso el numero de frases y el número de letras
        Para ver el numero de palabras nos metemos a frased
        Tenemos que poner un array en frases y en palabras para que meta cada elemento de la frase que es cortado con el
        split
        */
        for (String item:frases){
            int contador=item.split(" ").length;
        System.out.println("El numero de palabras de la oracion es "+contador);
        }
        /* este seria el metodo de crear un contador */
        scanner.close();
        scanner=null;
    }
    public void ejercicio2() {
        Scanner scanner=new Scanner(System.in);
        int intento=7;
        //0-49
        int numeroSistema=(int) (Math.random()*50);
        //Siempre cuando usamos la clase math . random ponemos por el numero hasta que queremos llegar mas uno porque nos genera
        //un numero aleatorio entre 0 y 0.99999
        boolean acertado=false;
        //empecamos en false por que solo lo vamos a cambiar si acertamos
        int numeroUsuario;
        do {
            System.out.println("Introduce el número para ver si aciertas");
            numeroUsuario= scanner.nextInt();
            intento--;
            if (numeroUsuario==numeroSistema){
                System.out.println("Numero acertado");
                acertado=true;
                break;
                //importante el breack para terminar
            }
            //lo hacemos con el do while en vez de con el for porque sabemos que minimo lo vamos a querer hacer una vez
        }while (intento>0);
        if(!acertado){
            System.out.println("Lo siento has perdido");
        }
        scanner.close();
        scanner=null;
    }
    public void ejercicio3(){
        String palabraSistema="frase";
        //palabra que quiero adivinar
        Scanner scaner= new Scanner(System.in);
        int intentos=5, numeroAcierto=0, numeroAprox=0, numeroDallos=0;
        
        do {
            intentos--;
            numeroAcierto=0;
            numeroAprox=0;
            numeroDallos=0;
            //Esto es para resetear
        System.out.println("Introduce la palabra");
        String palabraUsuario = scaner.nextLine();
            for (int i = 0; i < palabraSistema.length(); i++) {
                if (palabraSistema.equals(palabraUsuario)) {
                    // con el metodo.equals si acertamos las palabras nos da acierto
                    if (palabraSistema.charAt(i) == palabraUsuario.charAt(i)) {
                        // de esta forma vamos comparando cada una de las letras
                        numeroAcierto++;
                    } else if (palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                        // aqui con contains vemos si hay algun char que contenga en palabra usuario
                        numeroAprox++;
                    } else {
                        numeroDallos++;
                    }
                }
                System.out.println("Los aciertos en este intento son" +numeroAcierto);
                System.out.println("Los fallos en este intento son"+numeroDallos);
                System.out.println("Las paroximaciones en este intento son"+numeroAprox);

            }
        }while (intentos<0 && numeroAcierto==5);
        if (numeroAcierto==5){
            System.out.println("Palabra acertada correctamente");
        }else {
            System.out.println("Palabra no acertada");
        }

    }
    public void ejericio4 (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Creador de pizzas");
        int precio=0;
        String ingredientes="";
        System.out.println("El menu de pizzas es");
        System.out.println("1. Queso");
        System.out.println("2. Jamon");
        System.out.println("3. Piña");
        System.out.println("4. Tomate");
        System.out.println("5. Pepperoni");
        System.out.println("0. Salir");
        System.out.println("Indica los ingredientes a agregar");

        int ingrediente=scanner.nextInt();
        System.out.println("Introduce el numeo de ingredientes");
        int numeroIgredientes= scanner.nextInt();
        for (int i = 0; i < numeroIgredientes; i++) {
            if (ingrediente == 0) {
                break;
                //lo ponemos asi porque si va en case 0 se me rompe el swhitch pero no la repeticion del for
            }
            switch (ingrediente) {
                case 1 -> {
                    precio += 10;
                    ingredientes += "Queso";
                }
                case 2 -> {
                    precio += 15;
                    ingredientes += "Jamon";
                }
                case 3 -> {
                    precio += 8;
                    ingredientes += "Piña";
                }
                case 4 -> {
                    precio += 6;
                    ingredientes += "Tomate";
                }
                case 5 -> {
                    precio += 12;
                    ingredientes += "Pepperoni";
                }

            }
        }
        System.out.println("El precio de la pizza es "+precio);
        System.out.println("Los ingredientes son "+ ingredientes);
    }
}
