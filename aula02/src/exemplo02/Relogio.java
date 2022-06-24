package exemplo02;

public class Relogio {
    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    // métodos = ações
    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Overload = sobrecarga
    public Relogio() {
    }

    public Relogio(int hora) {
        this.hora = hora;
    }

    public void setHora(int novaHora) {
        if(novaHora >= 0 && novaHora < 24) {
            this.hora = novaHora;
        }
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void mostrarHora() {
        System.out.println(
                hora + ":" +
                minuto + ":" +
                segundo);
    }

}
