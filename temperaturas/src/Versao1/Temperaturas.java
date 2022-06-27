package Versao1;

public class Temperaturas {

    String[] cidades = {"Londres", "Madrid", "Nueva Work", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiado de Chile", "Lisboa", "Tokio"};
    int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

    private int temperaturaMinima = 0;
    private int temperaturaMaxima = 1;
    private String MAIOR = "MAIOR";
    private String MENOR = "MENOR";


    public void getCidade() {
        int max = temperaturas[0][0];
        int min = temperaturas[0][0];
        String cidadeMaior = cidades[0];
        String cidadeMenor = cidades[0];

        for (int line = 0; line < temperaturas.length; line++) {
            for (int column = 0; column < temperaturas[line].length; column++) {
                if (temperaturas[line][column] > max) {
                    max = temperaturas[line][column];
                    cidadeMaior = cidades[line];
                }

                if (temperaturas[line][column] < min) {
                    min = temperaturas[line][column];
                    cidadeMenor = cidades[line];
                }
            }
        }

        System.out.println("A  maior temperatura é na cidade de " + cidadeMaior + " " + max);
        System.out.println("A  menor temperatura é na cidade de " + cidadeMenor + " " + min);
    }

    private int buscaIndiceTemperatura(String opcao) {
        int maiorTemperatura = 0;
        int indiceMaiorTemperatura = 0;
        int menorTemperatura = 0;
        int indiceMenorTemperatura = 0;

        for (int i = 0; i < cidades.length; i++) {
            if (temperaturas[i][1] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i][1];
                indiceMaiorTemperatura = i;
            }

            if (temperaturas[i][0] < menorTemperatura) {
                menorTemperatura = temperaturas[i][0];
                indiceMenorTemperatura = i;
            }
        }

        if (opcao.equals("MAIOR")) {
            return indiceMaiorTemperatura;
        } else {
            return indiceMenorTemperatura;
        }
    }

}
