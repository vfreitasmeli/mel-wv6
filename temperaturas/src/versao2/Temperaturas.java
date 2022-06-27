package versao2;

public class Temperaturas {
    final int TEMP_MIN = 0;
    final int TEMP_MAX = 1;
    String[] cidades;
    int[][] temperaturas;

    public Temperaturas(String[] cidades, int[][] temperaturas) {
        this.cidades = cidades;
        this.temperaturas = temperaturas;
    }

    public void getDados() {
        int indiceCidadeComMaiorTemp = 0;
        int indiceCidadeComMenorTemp = 0;
        int maiorTemperatura = temperaturas[indiceCidadeComMaiorTemp][TEMP_MAX];
        int menorTemperatura = temperaturas[indiceCidadeComMenorTemp][TEMP_MIN];

        for (int cidade = 0; cidade < cidades.length; cidade++) {
            if (temperaturas[cidade][TEMP_MAX] > maiorTemperatura) {
                maiorTemperatura = temperaturas[cidade][TEMP_MAX];
                indiceCidadeComMaiorTemp = cidade;
            }

            if (temperaturas[cidade][TEMP_MIN] < menorTemperatura) {
                menorTemperatura = temperaturas[cidade][TEMP_MIN];
                indiceCidadeComMenorTemp = cidade;
            }
        }

        System.out.printf("A  cidade de %s teve a maior temperatura: %d°C\n", cidades[indiceCidadeComMaiorTemp], maiorTemperatura);
        System.out.printf("A  cidade de %s teve a menor temperatura: %d°C\n", cidades[indiceCidadeComMenorTemp], menorTemperatura);
    }

}
