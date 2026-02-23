package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicheros {

    public void crearFichero(String path){
        //Cuando cree este fichero este fichero sera ya hecho
        File file=new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Herror en la creación del fichero");
        }
    }


    public void crearCarpeta(String path) {
        File file=new File(path);
        file.mkdirs();
        //file.list()devuelve un array de las cocsas que hay dentro de la ruta
    }

    public void lectorFicheros(String path){
        File file =new File(path);
        FileReader reader=null;
        //El posible file puede no existir
        try {
            reader=new FileReader(file);
            int codigo;
            /*System.out.println((char)codigo ); esta seria la forma de leerlos de uno en uno pero
            podemos hacer que se leea con un while en el que pongamos que se lee mientras este en
            modo lectura y que el valor que reciba este entre 0 y 300*/
            while ((codigo=reader.read())!=-1){
                System.out.println((char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            lectorFicheros("nueva ruta");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }

    public void leerLineas(String path){
        File file=new File(path);
        BufferedReader bufferedReader=null;
        //vale ya tenemos creado la variable con la ruta y ahora la vamos a poner en modo reader
        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            /*String linea= bufferedReader.readLine();*/
            String linea=null;
            while ((linea= bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally{
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Herror en el cerrado");
            }
        }
    }

    public void escribirCaracteres(String path){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime que mensaje quieres guardar");
        String mensaje= scanner.nextLine();
        File file=new File(path);
        FileWriter writer=null;

        try {
            writer  =new FileWriter(file,true);
            //recorremos con un for tutti el mensaje
            for (int i = 0; i <mensaje.length() ; i++) {
                //sacamos las letras del mensaje una por una
                char letra=mensaje.charAt(i);
                //le pasamos una por una las letras al writer
                //le podemos pasar o la letra o le podemos pasar el codigo de la letra
                writer.write((int)letra);
                writer.write(String.valueOf((int)letra)); // esta sería la forma de codificar el mensaje
            }
            writer.write("Hola");
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }
    public void escribirLineas(String path){
        File file=new File(path);
        //BufferedWriter bufferedWriter; version mas antigua que te obliga a meterles excepciones y cerrarla
        PrintWriter printWriter=null; //más moderna
        try {
            printWriter =new PrintWriter(new FileWriter(file),true);
            printWriter.println("esta línea es un nuevo ejemplo de como escibir");
            printWriter.println("Ahra se ocmo hacer la escritura de fomra conjunta");
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } printWriter.close();
    }

    public void codificarMensajes(String path){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime el mensaje que quieres cifrar");
        String mensaje=scanner.nextLine();
        System.out.println("Ahora dime la fase en la que quieres cifrar el mensae");
        int fase=scanner.nextInt();
        File file=new File(path);
        Writer writer=null;
        try {
            writer=new FileWriter(file, true);
            for (int i = 0; i < mensaje.length(); i++) {
            char letra=mensaje.charAt(i);
            writer.write(String.valueOf(((int) letra)*fase));
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        }
    }
    public void descifrarMensaje(String path){
        File file=new File(path);
        BufferedReader bufferedReader=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ahora dime la fase en la que quieres cifrar el mensae");
        int fase=scanner.nextInt();
        try {
            bufferedReader =new BufferedReader(new FileReader( file));
            String line= bufferedReader.readLine();
            String[] codigos=line.split(" ");
            for (String code: codigos){
                int numero=Integer.parseInt(code)/fase;
                System.out.println((char)numero);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("no encontrado permisos de lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }
}
