public class MainBonoloto {
    public static void main(String[] args) {
        Bonolo bonoloto=new Bonolo();
        bonoloto.iniciaJuego();
        System.out.println("Los numeros del sistema son");
        bonoloto.listarNumeroSistema();
        System.out.println("Los numeros del usuario son");
        bonoloto.listarNumeroUsuario();
    }
}
