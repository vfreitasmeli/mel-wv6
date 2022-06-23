package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
        final int TAMANHO = 5;
        int numeros[] = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) { // i = index
            numeros[i] = i;
        }

        for (int i = 0; i < numeros.length; i++) { // i = index
            System.out.print(numeros[i] + " ");
        }

    }
}
