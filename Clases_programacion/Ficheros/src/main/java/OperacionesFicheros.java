import java.io.*;
import java.net.Socket;

public class OperacionesFicheros {

    public void leerDatosFcichero(){
        File file=new File("src/main/java/resources/Ficheros/fichero.txt");
        System.out.println("Existe"+file.exists());
        System.out.println("Tamaño"+ file.length());
        System.out.println("Es fichero"+file.isFile());
        System.out.println("Es carpeta"+file.isDirectory());
        System.out.println("Ruta abs"+file.getAbsolutePath());
    }
    public void leerHijos(String path){
        //Sacar las rutas de los hijos
        File file =new File(path);
        /*for(File s : file.listFiles()){
            System.out.println(s);
            //Sacar la ruta de los hijos ya que pasamos si el hijo es una carpeta
            if (s.isDirectory());
                for (File s1 : s.listFiles()){
                    System.out.println("\t"+s1);
                }
        }*/

        //Si lo hacemos de la siguiente forma lo hacemos de forma recursiva evitando anidar todo el rato
        //ya que va dando vueltas y vueltas hasta que no entre por el i
        for (File s:file.listFiles()){
            System.out.println(s);
            if (s.isDirectory()){
                leerHijos(s.getAbsolutePath());
            }
        }
    }
    public void crearFicheros(String path){
        File file=new File(path+"/propio.txt"); //Esto es un fichero logico ya que no exist no esta creado
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Fallo en la escritura");
                System.out.println(e.getMessage());
            }
        }
    }
    public void crearDirectorio(String path){
        File file=new File(path+"/ejemplo/cosa");
        //file.deleteOnExit(); para borrar un file
        if (!file.exists()){
            file.mkdirs();// entre mkdir y mkdirs es que en mkdirs tambien me crea la ruta si esta no existe

        }
    }
    public void lecturasASCII(String path){
        File file=new File(path);
        FileReader reader=null;
        try{
            reader=new FileReader(file);
            int codigo=-1;
            while((codigo=reader.read())!=-1){
                System.out.println((char)codigo);
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
        }
    }

    public void lecturaLinea(String path){
        File file =new File(path);
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String linea=null;
            while ((linea=bufferedReader.readLine())!=null){
                System.out.println(linea);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error en la lectura de la ruta");
        }
        catch(IOException e){
            System.out.println("Error en el modo del fichero, estas en modo lectura");
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException |NullPointerException e) {
                System.out.println("Error al cerrar");
            }
        }
    }
    public void lectorCodigo(String path){
        File file=new File(path);

    }
}
