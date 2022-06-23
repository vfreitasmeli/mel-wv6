package exemplo01;

/*
Primeiro exemplo de código Java
autor:
data:
versão:
 */

public class Exemplo01 {
    // main = principal, ponto de início de execução
    public static void main(String[] args) {
        int numero, numero2;
        double numeroDouble;
        long numeroLong = 12;

        numero = ((12 + 3) * 5);

        numero = (int) 4.999999; // casting =  conversão

        numeroDouble = 4;

        numero = (int) numeroDouble;

        System.out.println("Resultado = " + numero); // concatenação
    }

}
