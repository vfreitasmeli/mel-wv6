package versao2;

public class AppTempV2 {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nueva Work", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiado de Chile", "Lisboa", "Tokio"};
        int[][] temperaturasObtidas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        Temperaturas temperaturas = new Temperaturas(cidades, temperaturasObtidas);

        temperaturas.getDados();
    }
}
