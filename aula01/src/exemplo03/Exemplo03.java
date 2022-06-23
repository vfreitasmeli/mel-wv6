package exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        int contador = 0;

        /*
        int valor;

        // valor = contador++; //pós-incremento: primeiro faz a atribuição, depois faz ++
        valor = ++contador; //pré-incremento: primeiro faz o ++, depois faz atribuição

        System.out.println(valor);
        System.out.println(contador);

*/

        contador = 0; // 1. inicio
        while( contador < 5 ) { // 2. condição
            System.out.println("contagem");
            // contador = contador + 1; // contador += 1;
            contador++; // 3. passo
        }

        for(contador = 0 ; contador < 5 ; contador++) {
            System.out.println("contagem");
        }

        for(contador = 0 ; contador < 5 ; contador++) {
            for(int a = 0 ; a < 5 ; a++) {
                System.out.println("contagem");
            }
        }

        for (int i = 10, a = 0 ; i > 0 ;  a += 6, i--) {

        }


    }
}
