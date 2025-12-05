import java.util.Scanner;

public class Ejercicios {
    Scanner entradaDatos;
    public void ejercicio1(){
        int [][]numero= new int[3][3];
        numero[0][0]=1;
        numero[0][1]=2;
        numero[0][2]=3;
        numero[1][0]=4;
        numero[1][1]=5;
        numero[1][2]=6;
        numero[2][0]=7;
        numero[2][1]=8;
        numero[2][2]=9;
        for (int i = 0; i <numero.length ; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.printf("%d ",numero[i][j]);
            }
            System.out.printf("%n");
        }
    }
    public void ejercicio2(){
    entradaDatos=new Scanner(System.in);
    int [][]lista=new int[2][4];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.printf("Introduce el valor de la posición[%d][%d]%n",i,j);
                lista[i][j]=entradaDatos.nextInt();
            }
        }
        for (int i = 0; i <lista.length ; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.printf("%d ",lista[i][j]);
            }
            System.out.printf("%n");
        }
        entradaDatos.close();
    }
    public void ejercicio3(){
    int[][] numeros=new int[4][4];
    numeros[0][0]=1;
    numeros[0][1]=2;
    numeros[0][2]=3;
    numeros[0][3]=4;
    numeros[1][0]=5;
    numeros[1][1]=6;
    numeros[1][2]=7;
    numeros[1][3]=8;
    numeros[2][0]=9;
    numeros[2][1]=10;
    numeros[2][2]=11;
    numeros[2][3]=12;
    numeros[3][0]=13;
    numeros[3][1]=14;
    numeros[3][2]=15;
    numeros[3][3]=16;
    int suma=0;
        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("%d ",numeros[i][j]);
                suma+=numeros[i][j];
            }
            System.out.printf("%n");
        }
    System.out.println("El numero de la suma es "+suma);
    }
    public void ejercicio4(){
        int[][] numeros=new int[5][5];
        numeros[0][0]=12;
        numeros[0][1]=45;
        numeros[0][2]=23;
        numeros[0][3]=67;
        numeros[0][4]=89;
        numeros[1][0]=34;
        numeros[1][1]=56;
        numeros[1][2]=78;
        numeros[1][3]=90;
        numeros[1][3]=11;
        numeros[2][0]=22;
        numeros[2][1]=33;
        numeros[2][2]=44;
        numeros[2][3]=55;
        numeros[2][4]=66;
        System.out.println("Introduce el numero que deseas buscar");
        entradaDatos=new Scanner(System.in);
        int numeroEntrada =entradaDatos.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                if (numeros[i][j]==numeroEntrada){
                    System.out.printf("Tu numero %d se encuentra en la posicion [%d][%d]",numeroEntrada,i,j);
                    break;
                }
            }
        }
        System.out.println("Tu numero no se encuentra en la lista");
        entradaDatos.close();
        entradaDatos=null;
    }
    public void ejercicio5(){
        double[][] numeros=new double[4][3];
        numeros[0][0]=5.5;
        numeros[0][1]=7.2;
        numeros[0][2]=6.8;
        numeros[1][0]=8.1;
        numeros[1][1]=9.3;
        numeros[1][2]=7.5;
        numeros[2][0]=4.2;
        numeros[2][1]=5.6;
        numeros[2][2]=6.1;
        numeros[3][0]=7.8;
        numeros[3][1]=8.9;
        numeros[3][2]=9.2;
        double promedio=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                    promedio+=numeros[i][j];
                }
            promedio/= numeros.length;
            System.out.printf("El promedio de la fila %d es %.2f %n",i,promedio);
            }
        }
    public void ejercicio6(){
        int[][] numeros=new int[3][4];
        numeros[0][0]=15;
        numeros[0][1]=23;
        numeros[0][2]=8;
        numeros[0][3]=19;
        numeros[1][0]=42;
        numeros[1][1]=17;
        numeros[1][2]=31;
        numeros[1][3]=25;
        numeros[2][0]=28;
        numeros[2][1]=35;
        numeros[2][2]=12;
        numeros[2][3]=40;
        double promedio=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (promedio<numeros[i][j]){
                    promedio=numeros[i][j];
                }
            }
            System.out.printf("El numero mayor de la fila %d es %.2f %n",i,promedio);
        }
    }
    public void ejercicio7(){
        int[][] matrizUno=new int[3][4];
        matrizUno[0][0]=1;
        matrizUno[0][1]=2;
        matrizUno[0][2]=3;
        matrizUno[0][3]=4;
        matrizUno[1][0]=5;
        matrizUno[1][1]=6;
        matrizUno[1][2]=7;
        matrizUno[1][3]=8;
        matrizUno[2][0]=9;
        matrizUno[2][1]=10;
        matrizUno[2][2]=11;
        matrizUno[2][3]=12;
        int[][] matrizDos=new int[4][3];
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
            matrizDos[j][i]=matrizUno[i][j];
            }
        }
        //Al ir metiendo cosas  ala matrize cambiando la i y la j que son la columna y las filas cambio el lugar de las
        //columnas  y las filas
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos[i].length; j++) {
                System.out.printf("%d",matrizDos [i][j]);
            }
            System.out.printf("%n");
        }
    }
    public void ejercicio8 (){
        int[][] matriz=new int[4][5];
        matriz[0][0]=12;
        matriz[0][1]=15;
        matriz[0][2]=8;
        matriz[0][3]=23;
        matriz[0][4]=24;
        matriz[1][0]=17;
        matriz[1][1]=20;
        matriz[1][2]=9;
        matriz[1][3]=14;
        matriz[1][4]=27;
        matriz[2][0]=6;
        matriz[2][1]=11;
        matriz[2][2]=18;
        matriz[2][3]=25;
        matriz[2][4]=31;
        matriz[3][0]=13;
        matriz[3][1]=22;
        matriz[3][2]=7;
        matriz[3][3]=16;
        matriz[3][4]=19;
        int contadorPares=0;
        int contadorImpares=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]%2==0){
                    contadorPares++;
                }else {
                    contadorImpares++;
                }
            }
        }
        System.out.printf("Los numero pares son %d.%nLos numeros impares son %d",contadorPares,contadorImpares);
    }
    public void ejercicio9(){
        int[][]tablaMultiplicar=new int[10][10];
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar[i].length; j++) {
                int resultado=(i+1)*(j+1);
                tablaMultiplicar[i][j]=resultado;
            }
        }
        for (int i = 0; i < tablaMultiplicar.length; i++) {
            for (int j = 0; j < tablaMultiplicar[i].length; j++) {
                System.out.printf("%d ",tablaMultiplicar [i][j]);
            }
            System.out.printf("%n");
        }
    }
    public void ejercicio10(){
        entradaDatos=new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay?");
        int numeroAlumnos= entradaDatos.nextInt();
        System.out.println("¿Cuantas asignaturas tienen?");
        int numeroAsignaturas= entradaDatos.nextInt();
        double [][]listaNtoas=new double[numeroAlumnos][numeroAsignaturas];
        for (int i = 0; i < listaNtoas.length; i++) {
            for (int j = 0; j < listaNtoas[i].length; j++) {
                System.out.printf("Introduce la nota del alumno %d en la asignatura %d %n",i+1,j+1);
                listaNtoas[i][j]= entradaDatos.nextDouble();
            }
        }
        System.out.println("--- TABLA DE NOTAS ---");
        System.out.println("        ASIG1  ASIG2  ASIG3  ASIG4");
        for (int i = 0; i < listaNtoas.length; i++) {
            System.out.printf("Est %d",i);
            for (int j = 0; j < listaNtoas[i].length; j++) {
                System.out.printf("%.2f",listaNtoas[i][j]);
            }
            System.out.printf("%n");
        }
        double promedio=0;
        System.out.println("--- PROMEDIO POR ESTUDIANTE ---");
        for (int i = 0; i < listaNtoas.length; i++) {
            System.out.printf("Est %d",i+1);
            for (int j = 0; j < listaNtoas[i].length; j++) {
                promedio+=listaNtoas[i][j];
            }
            promedio/= listaNtoas[i].length;
            System.out.printf("%.2f");
            System.out.printf("%n");
        }
        double promedioAsignatura=0;
        System.out.println("--- PROMEDIO POR ASIGNATURA ---");
        for (int i = 0; i < listaNtoas.length ; i++) {
            for (int j = 0; j < listaNtoas[i].length ; j++) {
            promedioAsignatura+=listaNtoas[j][i];
            }
            promedioAsignatura/= numeroAlumnos;
            System.out.printf("El promedio de la asignatura %d es %.2f %n", i+1,promedioAsignatura);
        }
        System.out.println("--- NOTA MÁS ALTA ---");
        double controlTotal=0;
        int controlAlumno=0;
        int controlAsignatura=0;
        for (int i = 0; i < listaNtoas.length; i++) {
            for (int j = 0; j < listaNtoas[i].length; j++) {
                if (controlTotal<listaNtoas[i][j]) {
                    controlTotal=listaNtoas[i][j];
                    controlAlumno=i;
                    controlAsignatura=j;
                }
            }
        }
        System.out.printf("La nota más alta es %.2f (Estudainte %d, Asignatura %d)", controlTotal, controlAlumno+1,controlAsignatura+1);
    }
}



