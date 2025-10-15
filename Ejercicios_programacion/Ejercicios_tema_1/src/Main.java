public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: definir y mostrar variables
        String nombre1= "Ana";
        int numero1= 25;
        String ciudad1= "Madrid";
        System.out.println(nombre1+numero1+ciudad1);

        //Ejercicio 2: modificar variables
        int puntuacionInicial= 0;
        System.out.println(puntuacionInicial);
        int primeraModificacion= puntuacionInicial + 5;
        System.out.println(primeraModificacion);
        int segundaModificacion= primeraModificacion * 2;
        System.out.println(segundaModificacion);
        int puntuacionFinal=primeraModificacion*3;
        System.out.println(puntuacionFinal);

        //Ejercicio 3: Tipos de variables
        String nombre= "Carlos";
        int edad = 30;
        boolean esEstudiante= true;
        double altura= 1.75;
        char letraInicial= 'C';

        System.out.println(nombre + " Tipo: String"+edad+ " Tipo: int"+ esEstudiante+" Tipo: boolean"+altura+" Tipo: double "+letraInicial+" Tipo: char");

        //Ejercicio 4: variables con nombres descriptivos
        String titulo= "Don Quijote de la Mancha ";
        String autor=" Miguel de Cervantes ";
        int añoDePublicacion= 1605;
        int numeroDePaginas= 863;
        boolean disponibilidadEnBiblioteca= true;
        System.out.println(titulo+autor+añoDePublicacion+numeroDePaginas+disponibilidadEnBiblioteca);

        //Ejerccio 5: declaración e usos de constantes
        final String aplicacion = "MiApp ";
        final String version= " 1.0.0 ";
        final double pi= 3.14159;
        String usuarioActual= "Laura";
        int nivel= 1;
        int puntuacion= 0;
        usuarioActual= " Miguel ";
        nivel= 2;
        puntuacion= 150;
        System.out.println(aplicacion+version+pi+usuarioActual+nivel+puntuacion);



    }

}
