import java.io.*;
import java.net.Socket;

public class OperadoresFicheros {
    public void ejercicio1(String path){
        //declaracion del metodo obligandome a que para iniciarse le metan una ruta
        System.out.println("Introduce la ruta del archivo");
        //peticion a un usuario
        File file=new File(path);
        // creacion del objeto file que nos da la referencia del archivo
        /*
                                    Lectura caracter por caracter

        FileReader reader=null;

        // creacion de una variable file reader que se llama reader
        try {
            reader=new FileReader(file);
            //creacion de un objeto reader que se dedeica a abrir el archivo reader
            int codigo=-1;
            // variable para gguardar caracetres
            while ((codigo= reader.read())!=-1){
                // en esta linea decimos que codigo ahora pasa a ser el lector de archivo con reader.read()
                // y que mientras sea diferente a menos uno puede seguir leyendo
                // cuando el archivo este vacio no me lo va a cambiar y al quedarse en -1 sale
                System.out.println((char)codigo);
                // al parsear un int(el numero en codigo ASCII) a char lo convertimos en letras/ simbolos
                // este bucle se iniciara mientras en el archivo haya numeros/ letras, cuando esto termine devolvera un
                //-1 que es su estado natural
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentr ala ruta a leer");
        } catch (IOException e) {
            System.out.println("Error al leer las excepciones");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }*/
        BufferedReader bufferedReader=null;
        //creo un objeto de tipo bufferedReader que se inicia apagado
        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            //asocio este bufferreader a un nuevo archivo de fileReader que tiene como referencia el file anterior
            String linea=null;
            //creo un string apagado
            while ((linea=bufferedReader.readLine())!=null){
                //creo un bucle while que convierte a la linea la lectura del buffer
                //mientras haya cosas dentro sigue el bucle que imprime cuando termine me lo cargo ya que su estado
                //natural es igual a null
                System.out.println(linea);
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void ejercicio2(String path, String palabra){
        System.out.println("Introduce la ruta a examinar");
        System.out.println("Introduce la palabra clave");
        File file=new File(path);
        BufferedReader bufferedReader=null;
        int contador=0;
        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String scaner=null;
            while ((scaner= bufferedReader.readLine())!=null){
                String[]palabras=scaner.split("\\s+");
                for (String p : palabras){
                    if (p.equals(palabra)){
                        contador++;
                    }
                }
            }
            System.out.println("La palabra "+palabra+" aparece"+ contador);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void ejercicio3(String path, String path2){
        System.out.println("Introduce la ruta del archivo original");
        System.out.println("Introduce la ruta a donde quieres crear la copia");
        File file=new File(path);
        FileWriter file2=null;
        BufferedReader bufferedReader=null;
        try {
            file2=new FileWriter(path2);
            bufferedReader=new BufferedReader(new FileReader(file));
            String scaner=null;
            while ((scaner= bufferedReader.readLine())!=null){
                    file2.write(scaner);
                    file2.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();

                if (file2 != null) {
                    file2.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void ejercicio4(String path){
        File file=new File(path);
        System.out.println("El tamaño del archivo es" + file.getTotalSpace());
        System.out.println("La última modificacion fue"+file.lastModified());
        System.out.println("Los permisos son" +file.getParentFile().canWrite() + file.getParentFile().canRead()+
                file.getParentFile().canExecute());
        System.out.println("Archivo oculto"+file.isHidden());
        System.out.println("La ruta absoluta es" +file.getAbsolutePath());
    }
    public void ejercicio5(String path){
        File file=new File(path);
        int cuenta=0;
        BufferedReader bufferedReader=null;
        try {
            String scanner=null;
            bufferedReader=new BufferedReader( new FileReader(file));
            while ((scanner= bufferedReader.readLine())!=null){
                cuenta++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error de lectura");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    public void ejercicio6(String path){
        File file=new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        FileWriter fileWriter=null;
        BufferedReader bufferedReader=null;
        try {
            fileWriter= new FileWriter(path);
            bufferedReader=new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}