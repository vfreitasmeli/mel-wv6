package lambda;

public class Exemplo04 {

    interface InterfacceString {
        String executar(String str);
    }

    public static void imprimir(String texto, InterfacceString inter) {
        String resultado = inter.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        InterfacceString mudar = s -> s + " complemento";
        imprimir("Meu texto", mudar);
    }


}
