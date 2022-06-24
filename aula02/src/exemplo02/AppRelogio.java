package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio  = new Relogio(56,64, 40);

//        relogio.hora = 12;
//        relogio.minuto = 64;
//        relogio.segundo = 11;

        relogio.setHora(12);

        relogio.mostrarHora();

        int horaAtual = relogio.getHora();

        System.out.println("Hora: " + horaAtual);
    }
}
